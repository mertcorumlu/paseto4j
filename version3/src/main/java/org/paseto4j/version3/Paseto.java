/*
 * MIT License
 *
 * Copyright (c) 2018 Nanne Baars
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.paseto4j.version3;

import java.security.SignatureException;
import org.paseto4j.commons.PrivateKey;
import org.paseto4j.commons.PublicKey;
import org.paseto4j.commons.SecretKey;

public class Paseto {

  private Paseto() {}

  /**
   * https://github.com/paseto-standard/paseto-spec/blob/master/docs/01-Protocol-Versions/Version3.md#encrypt
   */
  public static String encrypt(SecretKey key, String payload) {
    return PasetoLocal.encrypt(key, payload, "", "");
  }

  /**
   * https://github.com/paseto-standard/paseto-spec/blob/master/docs/01-Protocol-Versions/Version3.md#encrypt
   */
  public static String encrypt(SecretKey key, String payload, String footer) {
    return PasetoLocal.encrypt(key, payload, footer, "");
  }

  /**
   * https://github.com/paseto-standard/paseto-spec/blob/master/docs/01-Protocol-Versions/Version3.md#encrypt
   */
  public static String encrypt(
      SecretKey key, String payload, String footer, String implicitAssertion) {
    return PasetoLocal.encrypt(key, payload, footer, implicitAssertion);
  }

  /**
   * https://github.com/paseto-standard/paseto-spec/blob/master/docs/01-Protocol-Versions/Version3.md#encrypt
   */
  public static String encrypt(SecretKey key, byte[] payload) {
    return PasetoLocal.encrypt(key, payload, "", "");
  }

  /**
   * https://github.com/paseto-standard/paseto-spec/blob/master/docs/01-Protocol-Versions/Version3.md#encrypt
   */
  public static String encrypt(SecretKey key, byte[] payload, String footer) {
    return PasetoLocal.encrypt(key, payload, footer, "");
  }

  /**
   * https://github.com/paseto-standard/paseto-spec/blob/master/docs/01-Protocol-Versions/Version3.md#encrypt
   */
  public static String encrypt(
          SecretKey key, byte[] payload, String footer, String implicitAssertion) {
    return PasetoLocal.encrypt(key, payload, footer, implicitAssertion);
  }

  /**
   * https://github.com/paseto-standard/paseto-spec/blob/master/docs/01-Protocol-Versions/Version3.md#decrypt
   */
  public static String decrypt(SecretKey key, String signedMessage) {
    return PasetoLocal.decrypt(key, signedMessage, "");
  }

  /**
   * https://github.com/paseto-standard/paseto-spec/blob/master/docs/01-Protocol-Versions/Version3.md#decrypt
   */
  public static String decrypt(SecretKey key, String signedMessage, String footer) {
    return PasetoLocal.decrypt(key, signedMessage, footer);
  }

  /**
   * https://github.com/paseto-standard/paseto-spec/blob/master/docs/01-Protocol-Versions/Version3.md#sign
   */
  public static String decrypt(
      SecretKey key, String signedMessage, String footer, String implicitAssertion) {
    return PasetoLocal.decrypt(key, signedMessage, footer, implicitAssertion);
  }

  /**
   * https://github.com/paseto-standard/paseto-spec/blob/master/docs/01-Protocol-Versions/Version3.md#decrypt
   */
  public static byte[] decryptByteArray(SecretKey key, String signedMessage) {
    return PasetoLocal.decryptByteArray(key, signedMessage, "");
  }

  /**
   * https://github.com/paseto-standard/paseto-spec/blob/master/docs/01-Protocol-Versions/Version3.md#decrypt
   */
  public static byte[] decryptByteArray(SecretKey key, String signedMessage, String footer) {
    return PasetoLocal.decryptByteArray(key, signedMessage, footer);
  }

  /**
   * https://github.com/paseto-standard/paseto-spec/blob/master/docs/01-Protocol-Versions/Version3.md#sign
   */
  public static byte[] decryptByteArray(
          SecretKey key, String signedMessage, String footer, String implicitAssertion) {
    return PasetoLocal.decryptByteArray(key, signedMessage, footer, implicitAssertion);
  }

  /**
   * https://github.com/paseto-standard/paseto-spec/blob/master/docs/01-Protocol-Versions/Version3.md#sign
   */
  public static String sign(PrivateKey privateKey, String payload) {
    return sign(privateKey, payload, "");
  }

  /**
   * https://github.com/paseto-standard/paseto-spec/blob/master/docs/01-Protocol-Versions/Version3.md#sign
   */
  public static String sign(PrivateKey privateKey, String payload, String footer) {
    return sign(privateKey, payload, footer, "");
  }

  /**
   * https://github.com/paseto-standard/paseto-spec/blob/master/docs/01-Protocol-Versions/Version3.md#sign
   */
  public static String sign(
      PrivateKey privateKey, String payload, String footer, String implicitAssertion) {
    return PasetoPublic.sign(privateKey, payload, footer, implicitAssertion);
  }

  /**
   * https://github.com/paseto-standard/paseto-spec/blob/master/docs/01-Protocol-Versions/Version3.md#sign
   */
  public static String sign(PrivateKey privateKey, byte[] payload) {
    return sign(privateKey, payload, "");
  }

  /**
   * https://github.com/paseto-standard/paseto-spec/blob/master/docs/01-Protocol-Versions/Version3.md#sign
   */
  public static String sign(PrivateKey privateKey, byte[] payload, String footer) {
    return sign(privateKey, payload, footer, "");
  }

  /**
   * https://github.com/paseto-standard/paseto-spec/blob/master/docs/01-Protocol-Versions/Version3.md#sign
   */
  public static String sign(
          PrivateKey privateKey, byte[] payload, String footer, String implicitAssertion) {
    return PasetoPublic.sign(privateKey, payload, footer, implicitAssertion);
  }

  /**
   * https://github.com/paseto-standard/paseto-spec/blob/master/docs/01-Protocol-Versions/Version3.md#verify
   */
  public static String parse(PublicKey publicKey, String signedMessage) throws SignatureException {
    return parse(publicKey, signedMessage, "");
  }

  /**
   * https://github.com/paseto-standard/paseto-spec/blob/master/docs/01-Protocol-Versions/Version3.md#verify
   */
  public static String parse(PublicKey publicKey, String signedMessage, String footer)
      throws SignatureException {
    return parse(publicKey, signedMessage, footer, "");
  }

  /**
   * https://github.com/paseto-standard/paseto-spec/blob/master/docs/01-Protocol-Versions/Version3.md#verify
   */
  public static String parse(
      PublicKey publicKey, String signedMessage, String footer, String implicitAssertion)
      throws SignatureException {
    return PasetoPublic.parse(publicKey, signedMessage, footer, implicitAssertion);
  }

  /**
   * https://github.com/paseto-standard/paseto-spec/blob/master/docs/01-Protocol-Versions/Version3.md#verify
   */
  public static byte[] parseByteArray(PublicKey publicKey, String signedMessage) throws SignatureException {
    return parseByteArray(publicKey, signedMessage, "");
  }

  /**
   * https://github.com/paseto-standard/paseto-spec/blob/master/docs/01-Protocol-Versions/Version3.md#verify
   */
  public static byte[] parseByteArray(PublicKey publicKey, String signedMessage, String footer)
          throws SignatureException {
    return parseByteArray(publicKey, signedMessage, footer, "");
  }

  /**
   * https://github.com/paseto-standard/paseto-spec/blob/master/docs/01-Protocol-Versions/Version3.md#verify
   */
  public static byte[] parseByteArray(
          PublicKey publicKey, String signedMessage, String footer, String implicitAssertion)
          throws SignatureException {
    return PasetoPublic.parseByteArray(publicKey, signedMessage, footer, implicitAssertion);
  }
}
