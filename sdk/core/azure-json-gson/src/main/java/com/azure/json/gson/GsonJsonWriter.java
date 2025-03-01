// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.json.gson;

import com.azure.json.JsonOptions;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriteContext;
import com.azure.json.JsonWriter;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UncheckedIOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Objects;

/**
 * GSON-based implementation of {@link JsonWriter}.
 */
public final class GsonJsonWriter extends JsonWriter {
    private final com.google.gson.stream.JsonWriter writer;

    // Initial state is always root.
    private JsonWriteContext context = JsonWriteContext.ROOT;

    /**
     * Creates a {@link GsonJsonWriter} that writes the given {@link OutputStream}.
     * <p>
     * The passed {@link OutputStream} won't be closed when {@link #close()} is called as the {@link GsonJsonWriter}
     * isn't the owner of the stream.
     *
     * @param stream The {@link OutputStream} that will be written.
     * @param options {@link JsonOptions} to configure the creation of the {@link JsonWriter}.
     * @return An instance of {@link GsonJsonWriter}.
     */
    static JsonWriter toStream(OutputStream stream, JsonOptions options) {
        return new GsonJsonWriter(new OutputStreamWriter(stream, StandardCharsets.UTF_8), options);
    }

    /**
     * Creates a {@link GsonJsonWriter} that writes the given {@link Writer}.
     * <p>
     * The passed {@link Writer} won't be closed when {@link #close()} is called as the {@link GsonJsonWriter}
     * isn't the owner of the stream.
     *
     * @param writer The {@link Writer} that will be written.
     * @param options {@link JsonOptions} to configure the creation of the {@link JsonWriter}.
     * @return An instance of {@link GsonJsonWriter}.
     */
    static JsonWriter toWriter(Writer writer, JsonOptions options) {
        return new GsonJsonWriter(writer, options);
    }

    private GsonJsonWriter(Writer writer, JsonOptions options) {
        this.writer = new com.google.gson.stream.JsonWriter(writer);
        this.writer.setLenient(options.isNonNumericNumbersSupported());
    }

    @Override
    public JsonWriteContext getWriteContext() {
        return context;
    }

    @Override
    public void close() throws IOException {
        if (context != JsonWriteContext.COMPLETED) {
            throw new IllegalStateException("Writing of the JSON object must be completed before the writer can be "
                + "closed. Current writing state is '" + context.getWriteState() + "'.");
        }

        writer.close();
    }

    @Override
    public JsonWriter flush() {
        try {
            writer.flush();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        return this;
    }

    @Override
    public JsonWriter writeStartObject() {
        context.validateToken(JsonToken.START_OBJECT);

        try {
            writer.beginObject();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        context = context.updateContext(JsonToken.START_OBJECT);
        return this;
    }

    @Override
    public JsonWriter writeEndObject() {
        context.validateToken(JsonToken.END_OBJECT);

        try {
            writer.endObject();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        context = context.updateContext(JsonToken.END_OBJECT);
        return this;
    }

    @Override
    public JsonWriter writeStartArray() {
        context.validateToken(JsonToken.START_ARRAY);

        try {
            writer.beginArray();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        context = context.updateContext(JsonToken.START_ARRAY);
        return this;
    }

    @Override
    public JsonWriter writeEndArray() {
        context.validateToken(JsonToken.END_ARRAY);

        try {
            writer.endArray();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        context = context.updateContext(JsonToken.END_ARRAY);
        return this;
    }

    @Override
    public JsonWriter writeFieldName(String fieldName) {
        Objects.requireNonNull(fieldName, "'fieldName' cannot be null.");

        context.validateToken(JsonToken.FIELD_NAME);

        try {
            writer.name(fieldName);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        context = context.updateContext(JsonToken.FIELD_NAME);
        return this;
    }

    @Override
    public JsonWriter writeBinary(byte[] value) {
        context.validateToken(JsonToken.STRING);

        try {
            writeBinaryInternal(value);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        context = context.updateContext(JsonToken.STRING);
        return this;
    }

    @Override
    public JsonWriter writeBoolean(boolean value) {
        context.validateToken(JsonToken.BOOLEAN);

        try {
            writer.value(value);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        context = context.updateContext(JsonToken.BOOLEAN);
        return this;
    }

    @Override
    public JsonWriter writeDouble(double value) {
        context.validateToken(JsonToken.NUMBER);

        try {
            writer.value(value);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        context = context.updateContext(JsonToken.NUMBER);
        return this;
    }

    @Override
    public JsonWriter writeFloat(float value) {
        context.validateToken(JsonToken.NUMBER);

        try {
            writer.value(value);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        context = context.updateContext(JsonToken.NUMBER);
        return this;
    }

    @Override
    public JsonWriter writeInt(int value) {
        context.validateToken(JsonToken.NUMBER);

        try {
            writer.value(value);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        context = context.updateContext(JsonToken.NUMBER);
        return this;
    }

    @Override
    public JsonWriter writeLong(long value) {
        context.validateToken(JsonToken.NUMBER);

        try {
            writer.value(value);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        context = context.updateContext(JsonToken.NUMBER);
        return this;
    }

    @Override
    public JsonWriter writeNull() {
        context.validateToken(JsonToken.NULL);

        try {
            writer.nullValue();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        context = context.updateContext(JsonToken.NULL);
        return this;
    }

    @Override
    public JsonWriter writeString(String value) {
        context.validateToken(JsonToken.STRING);

        try {
            writer.value(value);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        context = context.updateContext(JsonToken.STRING);
        return this;
    }

    @Override
    public JsonWriter writeRawValue(String value) {
        Objects.requireNonNull(value, "'value' cannot be null.");

        context.validateToken(JsonToken.STRING);

        try {
            writer.jsonValue(value);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        context = context.updateContext(JsonToken.STRING);
        return this;
    }

    private void writeBinaryInternal(byte[] value) throws IOException {
        if (value == null) {
            writer.nullValue();
        } else {
            writer.value(Base64.getEncoder().encodeToString(value));
        }
    }
}
