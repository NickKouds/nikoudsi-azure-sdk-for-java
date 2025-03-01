// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.xml;

import java.io.Closeable;
import java.util.Base64;

/**
 * Writes an XML encoded value to a stream.
 */
@SuppressWarnings("resource")
public abstract class XmlWriter implements Closeable {
    /**
     * Writes the XML document start ({@code <?xml version="1.0" encoding="utf-8?>}).
     * <p>
     * This uses the default version and encoding which are {@code 1.0} and {@code utf-8} respectively. If a different
     * version or encoding is required use {@link #writeStartDocument(String, String)} which allows for specifying
     * those values.
     *
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML start document cannot be written.
     */
    public final XmlWriter writeStartDocument() {
        return writeStartDocument("1.0", "utf-8");
    }

    /**
     * Writes the XML document start ({@code <?xml version="1.0" encoding="utf-8?>}).
     * <p>
     * Both {@code version} and {@code encoding} are optional and if they aren't passed their default values will be
     * used. For {@code version} the default is {@code 1.0} and for {@code encoding} the default is {@code utf-8}.
     *
     * @param version XML document version.
     * @param encoding XML document encoding.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML start document cannot be written.
     */
    public abstract XmlWriter writeStartDocument(String version, String encoding);

    /**
     * Begins an XML element start ({@code <tag}).
     * <p>
     * This call doesn't close ({@code >}) the XML element start but instead defers it until a call to begin another
     * element or to write the body of the element. This also requires an explicit call to {@link #writeEndElement()} to
     * end the XML element's body.
     * <p>
     * Calls to write attributes won't close the XML element.
     *
     * @param localName Name of the element.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML element start cannot be written.
     */
    public final XmlWriter writeStartElement(String localName) {
        return writeStartElement(null, localName);
    }

    /**
     * Begins an XML element start that has a prefix ({@code <prefix:tag}).
     * <p>
     * This call doesn't close ({@code >}) the XML element start but instead defers it until a call to begin another
     * element or to write the body of the element. This also requires an explicit call to {@link #writeEndElement()} to
     * end the XML element's body.
     * <p>
     * Calls to write attributes won't close the XML element.
     * <p>
     * If {@code prefix} is null this will behave the same as {@link #writeStartElement(String)}.
     *
     * @param namespaceUri Namespace URI to bind the prefix to, if null the default namespace is used.
     * @param localName Name of the element.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML element start cannot be written.
     */
    public abstract XmlWriter writeStartElement(String namespaceUri, String localName);

    /**
     * Begins an XML element start that will be self-closing ({@code <tag/>}).
     * <p>
     * This call doesn't close ({@code />}) the XML element start but instead defers it until a call to begin another
     * element. If there is an attempt to write the body of the element after beginning a self-closing element an
     * {@link IllegalStateException} will be thrown as self-closing elements do not have a body.
     * <p>
     * Calls to write attributes won't close the XML element.
     *
     * @param localName Name of the element.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML element start cannot be written.
     */
    public final XmlWriter writeStartSelfClosingElement(String localName) {
        return writeStartSelfClosingElement(null, localName);
    }

    /**
     * Begins an XML element start that has a prefix that will be self-closing ({@code <prefix:tag/>}).
     * <p>
     * This call doesn't close ({@code />}) the XML element start but instead defers it until a call to begin another
     * element. If there is an attempt to write the body of the element after beginning a self-closing element an
     * {@link IllegalStateException} will be thrown as self-closing elements do not have a body.
     * <p>
     * Calls to write attributes won't close the XML element.
     * <p>
     * If {@code prefix} is null this will behave the same as {@link #writeStartSelfClosingElement(String)}.
     *
     * @param namespaceUri Namespace URI to bind the prefix to, if null the default namespace is used.
     * @param localName Name of the element.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML element start cannot be written.
     */
    public abstract XmlWriter writeStartSelfClosingElement(String namespaceUri, String localName);

    /**
     * Ends the current XML element by writing the closing tag ({@code </tag>}).
     * <p>
     * This call will determine the XML element tag name and prefix, if there is one, to close the current XML element
     * scope.
     *
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML element end cannot be written.
     */
    public abstract XmlWriter writeEndElement();

    /**
     * Writes a default XML namespace.
     *
     * @param namespaceUri Namespace URI to bind as the default namespace.
     * @return The updated XmlWriter object.
     */
    public abstract XmlWriter writeNamespace(String namespaceUri);

    /**
     * Writes a String attribute ({@code attribute="value"}).
     *
     * @param localName Name of the attribute.
     * @param value Value of the attribute.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML attribute cannot be written.
     */
    public final XmlWriter writeStringAttribute(String localName, String value) {
        return writeStringAttribute(null, localName, value);
    }

    /**
     * Writes a String attribute that has a prefix ({@code prefix:attribute="value"}).
     *
     * @param namespaceUri Namespace URI to bind the prefix to, if null the default namespace is used.
     * @param localName Name of the attribute.
     * @param value Value of the attribute.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML attribute cannot be written.
     */
    public abstract XmlWriter writeStringAttribute(String namespaceUri, String localName, String value);

    /**
     * Writes a binary attribute as a base64 string ({@code attribute="value"}).
     * <p>
     * If the {@code value} is null this is a no-op.
     *
     * @param localName Name of the attribute.
     * @param value Binary value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML attribute cannot be written.
     */
    public final XmlWriter writeBinaryAttribute(String localName, byte[] value) {
        return writeBinaryAttribute(null, localName, value);
    }

    /**
     * Writes a binary attribute as a base64 string that has a prefix ({@code prefix:attribute="value"}).
     * <p>
     * If the {@code value} is null this is a no-op.
     *
     * @param namespaceUri Namespace URI to bind the prefix to, if null the default namespace is used.
     * @param localName Name of the attribute.
     * @param value Binary value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML attribute cannot be written.
     */
    public final XmlWriter writeBinaryAttribute(String namespaceUri, String localName, byte[] value) {
        if (value == null) {
            return this;
        }

        return writeStringAttribute(namespaceUri, localName, convertBytesToString(value));
    }

    /**
     * Writes a boolean attribute ({@code attribute="true"}).
     *
     * @param localName Name of the attribute.
     * @param value boolean value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML attribute cannot be written.
     */
    public final XmlWriter writeBooleanAttribute(String localName, boolean value) {
        return writeStringAttribute(localName, String.valueOf(value));
    }

    /**
     * Writes a boolean attribute that has a prefix ({@code prefix:attribute="true"}).
     *
     * @param namespaceUri Namespace URI to bind the prefix to, if null the default namespace is used.
     * @param localName Name of the attribute.
     * @param value boolean value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML attribute cannot be written.
     */
    public final XmlWriter writeBooleanAttribute(String namespaceUri, String localName, boolean value) {
        return writeStringAttribute(namespaceUri, localName, String.valueOf(value));
    }

    /**
     * Writes a nullable boolean attribute ({@code attribute="false"}).
     * <p>
     * If the {@code value} is null this is a no-op.
     *
     * @param localName Name of the attribute.
     * @param value Boolean value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML attribute cannot be written.
     */
    public final XmlWriter writeBooleanAttribute(String localName, Boolean value) {
        return writeBooleanAttribute(null, localName, value);
    }

    /**
     * Writes a nullable boolean attribute that has a prefix ({@code prefix:attribute="false"}).
     * <p>
     * If the {@code value} is null this is a no-op.
     *
     * @param namespaceUri Namespace URI to bind the prefix to, if null the default namespace is used.
     * @param localName Name of the attribute.
     * @param value Boolean value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML attribute cannot be written.
     */
    public final XmlWriter writeBooleanAttribute(String namespaceUri, String localName, Boolean value) {
        if (value == null) {
            return this;
        }

        return writeStringAttribute(namespaceUri, localName, String.valueOf(value));
    }

    /**
     * Writes a double attribute ({@code attribute="3.14"}).
     *
     * @param localName Name of the attribute.
     * @param value double value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML attribute cannot be written.
     */
    public final XmlWriter writeDoubleAttribute(String localName, double value) {
        return writeStringAttribute(localName, String.valueOf(value));
    }

    /**
     * Writes a double attribute that has a prefix ({@code prefix:attribute="3.14"}).
     *
     * @param namespaceUri Namespace URI to bind the prefix to, if null the default namespace is used.
     * @param localName Name of the attribute.
     * @param value double value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML attribute cannot be written.
     */
    public final XmlWriter writeDoubleAttribute(String namespaceUri, String localName, double value) {
        return writeStringAttribute(namespaceUri, localName, String.valueOf(value));
    }

    /**
     * Writes a float attribute ({@code attribute="2.7"}).
     *
     * @param localName Name of the attribute.
     * @param value float value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML attribute cannot be written.
     */
    public final XmlWriter writeFloatAttribute(String localName, float value) {
        return writeStringAttribute(localName, String.valueOf(value));
    }

    /**
     * Writes a float attribute that has a prefix ({@code prefix:attribute="2.7"}).
     *
     * @param namespaceUri Namespace URI to bind the prefix to, if null the default namespace is used.
     * @param localName Name of the attribute.
     * @param value float value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML attribute cannot be written.
     */
    public final XmlWriter writeFloatAttribute(String namespaceUri, String localName, float value) {
        return writeStringAttribute(namespaceUri, localName, String.valueOf(value));
    }

    /**
     * Writes an int attribute ({@code attribute="10"}).
     *
     * @param localName Name of the attribute.
     * @param value int value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML attribute cannot be written.
     */
    public final XmlWriter writeIntAttribute(String localName, int value) {
        return writeStringAttribute(localName, String.valueOf(value));
    }

    /**
     * Writes an int attribute that has a prefix ({@code prefix:attribute="10"}).
     *
     * @param namespaceUri Namespace URI to bind the prefix to, if null the default namespace is used.
     * @param localName Name of the attribute.
     * @param value int value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML attribute cannot be written.
     */
    public final XmlWriter writeIntAttribute(String namespaceUri, String localName, int value) {
        return writeStringAttribute(namespaceUri, localName, String.valueOf(value));
    }

    /**
     * Writes a long attribute ({@code attribute="100000000000"}).
     *
     * @param localName Name of the attribute.
     * @param value long value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML attribute cannot be written.
     */
    public final XmlWriter writeLongAttribute(String localName, long value) {
        return writeStringAttribute(localName, String.valueOf(value));
    }

    /**
     * Writes a long attribute that has a prefix ({@code prefix:attribute="100000000000"}).
     *
     * @param namespaceUri Namespace URI to bind the prefix to, if null the default namespace is used.
     * @param localName Name of the attribute.
     * @param value long value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML attribute cannot be written.
     */
    public final XmlWriter writeLongAttribute(String namespaceUri, String localName, long value) {
        return writeStringAttribute(namespaceUri, localName, String.valueOf(value));
    }

    /**
     * Writes a nullable number attribute ({@code attribute="number"}).
     *
     * @param localName Name of the attribute.
     * @param value Number value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML attribute cannot be written.
     */
    public final XmlWriter writeNumberAttribute(String localName, Number value) {
        return writeNumberAttribute(null, localName, value);
    }

    /**
     * Writes a nullable number attribute that has a prefix ({@code prefix:attribute="number"}).
     *
     * @param namespaceUri Namespace URI to bind the prefix to, if null the default namespace is used.
     * @param localName Name of the attribute.
     * @param value Number value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML attribute cannot be written.
     */
    public final XmlWriter writeNumberAttribute(String namespaceUri, String localName, Number value) {
        if (value == null) {
            return this;
        }

        return writeStringAttribute(namespaceUri, localName, String.valueOf(value));
    }

    /**
     * Writes a binary element as a base64 string ({@code <tag>value</tag}).
     * <p>
     * If the {@code value} is null this is a no-op.
     *
     * @param localName Name of the element.
     * @param value Binary value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML element and value cannot be written.
     */
    public final XmlWriter writeBinaryElement(String localName, byte[] value) {
        return writeBinaryElement(null, localName, value);
    }

    /**
     * Writes a binary element as a base64 string that has a prefix ({@code <tag>value</tag}).
     * <p>
     * If the {@code value} is null this is a no-op.
     *
     * @param namespaceUri Namespace URI to bind the prefix to, if null the default namespace is used.
     * @param localName Name of the element.
     * @param value Binary value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML element and value cannot be written.
     */
    public final XmlWriter writeBinaryElement(String namespaceUri, String localName, byte[] value) {
        if (value == null) {
            return this;
        }

        return writeStartElement(namespaceUri, localName)
            .writeBinary(value)
            .writeEndElement();
    }

    /**
     * Writes a boolean element ({@code <tag>true</tag}).
     *
     * @param localName Name of the element.
     * @param value boolean value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML element and value cannot be written.
     */
    public final XmlWriter writeBooleanElement(String localName, boolean value) {
        return writeBooleanElement(null, localName, value);
    }

    /**
     * Writes a boolean element that has a prefix ({@code <tag>true</tag}).
     *
     * @param namespaceUri Namespace URI to bind the prefix to, if null the default namespace is used.
     * @param localName Name of the element.
     * @param value boolean value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML element and value cannot be written.
     */
    public final XmlWriter writeBooleanElement(String namespaceUri, String localName, boolean value) {
        return writeStartElement(namespaceUri, localName)
            .writeBoolean(value)
            .writeEndElement();
    }

    /**
     * Writes a nullable boolean element ({@code <tag>true</tag}).
     * <p>
     * If the {@code value} is null this is a no-op.
     *
     * @param localName Name of the element.
     * @param value Boolean value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML element and value cannot be written.
     */
    public final XmlWriter writeBooleanElement(String localName, Boolean value) {
        return writeBooleanElement(null, localName, value);
    }

    /**
     * Writes a nullable boolean element that has a prefix ({@code <tag>true</tag}).
     * <p>
     * If the {@code value} is null this is a no-op.
     *
     * @param namespaceUri Namespace URI to bind the prefix to, if null the default namespace is used.
     * @param localName Name of the element.
     * @param value Boolean value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML element and value cannot be written.
     */
    public final XmlWriter writeBooleanElement(String namespaceUri, String localName, Boolean value) {
        if (value == null) {
            return this;
        }

        return writeStartElement(namespaceUri, localName)
            .writeBoolean(value.booleanValue())
            .writeEndElement();
    }

    /**
     * Writes a double element ({@code <tag>3.14</tag}).
     *
     * @param localName Name of the element.
     * @param value double value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML element and value cannot be written.
     */
    public final XmlWriter writeDoubleElement(String localName, double value) {
        return writeDoubleElement(null, localName, value);
    }

    /**
     * Writes a double element that has a prefix ({@code <tag>3.14</tag}).
     *
     * @param namespaceUri Namespace URI to bind the prefix to, if null the default namespace is used.
     * @param localName Name of the element.
     * @param value double value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML element and value cannot be written.
     */
    public final XmlWriter writeDoubleElement(String namespaceUri, String localName, double value) {
        return writeStartElement(namespaceUri, localName)
            .writeDouble(value)
            .writeEndElement();
    }

    /**
     * Writes a float element ({@code <tag>2.7</tag}).
     *
     * @param localName Name of the element.
     * @param value float value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML element and value cannot be written.
     */
    public final XmlWriter writeFloatElement(String localName, float value) {
        return writeFloatElement(null, localName, value);
    }

    /**
     * Writes a float element that has a prefix ({@code <tag>2.7</tag}).
     *
     * @param namespaceUri Namespace URI to bind the prefix to, if null the default namespace is used.
     * @param localName Name of the element.
     * @param value float value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML element and value cannot be written.
     */
    public final XmlWriter writeFloatElement(String namespaceUri, String localName, float value) {
        return writeStartElement(namespaceUri, localName)
            .writeFloat(value)
            .writeEndElement();
    }

    /**
     * Writes an int element ({@code <tag>10</tag}).
     *
     * @param localName Name of the element.
     * @param value int value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML element and value cannot be written.
     */
    public final XmlWriter writeIntElement(String localName, int value) {
        return writeIntElement(null, localName, value);
    }

    /**
     * Writes an int element that has a prefix ({@code <tag>10</tag}).
     *
     * @param namespaceUri Namespace URI to bind the prefix to, if null the default namespace is used.
     * @param localName Name of the element.
     * @param value int value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML element and value cannot be written.
     */
    public final XmlWriter writeIntElement(String namespaceUri, String localName, int value) {
        return writeStartElement(namespaceUri, localName)
            .writeInt(value)
            .writeEndElement();
    }

    /**
     * Writes a long element ({@code <tag>100000000000</tag}).
     *
     * @param localName Name of the element
     * @param value long value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML element and value cannot be written.
     */
    public final XmlWriter writeLongElement(String localName, long value) {
        return writeLongElement(null, localName, value);
    }

    /**
     * Writes a long element that has a prefix ({@code <tag>100000000000</tag}).
     *
     * @param namespaceUri Namespace URI to bind the prefix to, if null the default namespace is used.
     * @param localName Name of the element.
     * @param value long value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML element and value cannot be written.
     */
    public final XmlWriter writeLongElement(String namespaceUri, String localName, long value) {
        return writeStartElement(namespaceUri, localName)
            .writeLong(value)
            .writeEndElement();
    }

    /**
     * Writes a nullable number element ({@code <tag>number</tag}).
     * <p>
     * If the {@code value} is null this is a no-op.
     *
     * @param localName Name of the element.
     * @param value Number value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML element and value cannot be written.
     */
    public final XmlWriter writeNumberElement(String localName, Number value) {
        return writeNumberElement(null, localName, value);
    }

    /**
     * Writes a nullable number element that has a prefix ({@code <tag>number</tag}).
     * <p>
     * If the {@code value} is null this is a no-op.
     *
     * @param namespaceUri Namespace URI to bind the prefix to, if null the default namespace is used.
     * @param localName Name of the element.
     * @param value Number value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML element and value cannot be written.
     */
    public final XmlWriter writeNumberElement(String namespaceUri, String localName, Number value) {
        if (value == null) {
            return this;
        }

        return writeStartElement(namespaceUri, localName)
            .writeNumber(value)
            .writeEndElement();
    }

    /**
     * Writes a string element ({@code <tag>string</tag}).
     * <p>
     * If the {@code value} is null this is a no-op.
     *
     * @param localName Name of the element.
     * @param value String value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML element and value cannot be written.
     */
    public final XmlWriter writeStringElement(String localName, String value) {
        return writeStringElement(null, localName, value);
    }

    /**
     * Writes a string element that has a prefix ({@code <tag>string</tag}).
     * <p>
     * If the {@code value} is null this is a no-op.
     *
     * @param namespaceUri Namespace URI to bind the prefix to, if null the default namespace is used.
     * @param localName Name of the element.
     * @param value String value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML element and value cannot be written.
     */
    public final XmlWriter writeStringElement(String namespaceUri, String localName, String value) {
        if (value == null) {
            return this;
        }

        return writeStartElement(namespaceUri, localName)
            .writeString(value)
            .writeEndElement();
    }

    /**
     * Writes an {@link XmlSerializable} object.
     * <p>
     * If the {@code value} is null this is a no-op.
     *
     * @param value {@link XmlSerializable} object to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML object cannot be written.
     */
    public final XmlWriter writeXml(XmlSerializable<?> value) {
        return value == null ? this : value.toXml(this);
    }

    /**
     * Writes a binary value as a base64 string.
     * <p>
     * If the {@code value} is null this is a no-op.
     *
     * @param value Binary value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML value cannot be written.
     */
    public final XmlWriter writeBinary(byte[] value) {
        return value == null ? this : writeString(convertBytesToString(value));
    }

    /**
     * Writes a boolean value.
     *
     * @param value boolean value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML value cannot be written.
     */
    public final XmlWriter writeBoolean(boolean value) {
        return writeString(String.valueOf(value));
    }

    /**
     * Writes a nullable boolean value.
     * <p>
     * If the {@code value} is null this is a no-op.
     *
     * @param value Boolean value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML value cannot be written.
     */
    public final XmlWriter writeBoolean(Boolean value) {
        return value == null ? this : writeString(String.valueOf(value));
    }

    /**
     * Writes a double value.
     *
     * @param value double value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML value cannot be written.
     */
    public final XmlWriter writeDouble(double value) {
        return writeString(String.valueOf(value));
    }

    /**
     * Writes a float value.
     *
     * @param value float value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML value cannot be written.
     */
    public final XmlWriter writeFloat(float value) {
        return writeString(String.valueOf(value));
    }

    /**
     * Writes an int value.
     *
     * @param value int value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML value cannot be written.
     */
    public final XmlWriter writeInt(int value) {
        return writeString(String.valueOf(value));
    }

    /**
     * Writes a long value.
     *
     * @param value long value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML value cannot be written.
     */
    public final XmlWriter writeLong(long value) {
        return writeString(String.valueOf(value));
    }

    /**
     * Writes a nullable number.
     * <p>
     * If {@code value} is null this is a no-op.
     *
     * @param value Number value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML value cannot be written.
     */
    public final XmlWriter writeNumber(Number value) {
        return value == null ? this : writeString(String.valueOf(value));
    }

    /**
     * Writes a value directly into an XML element ({@code <tag>value</tag>}).
     * <p>
     * This doesn't write the XML element start tag or end tag.
     * <p>
     * {@link #writeCDataString(String)} is a convenience API if an XML CData value needs to be written.
     *
     * @param value Value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML value cannot be written.
     */
    public abstract XmlWriter writeString(String value);

    /**
     * Writes a CData value directly into an XML element ({@code <tag><![CDATA[value]]></tag>}).
     * <p>
     * This doesn't write the XML element start tag or end tag.
     * <p>
     * This API is a convenience over {@link #writeString(String)} for CData values, it is possible to use
     * {@link #writeString(String)} instead of this API.
     *
     * @param value CData value to write.
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the XML CData value cannot be written.
     */
    public abstract XmlWriter writeCDataString(String value);

    /**
     * Flushes any un-flushed content that has been written to the {@link XmlWriter}.
     *
     * @return The updated XmlWriter object.
     * @throws RuntimeException If the un-flushed XML content could not be flushed.
     */
    public abstract XmlWriter flush();

    private static String convertBytesToString(byte[] bytes) {
        if (bytes == null) {
            return null;
        }

        return Base64.getEncoder().encodeToString(bytes);
    }
}
