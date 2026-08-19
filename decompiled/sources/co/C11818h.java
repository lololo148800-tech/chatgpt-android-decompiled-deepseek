package co;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p023Al.C0556b;
import p909nm.C17677k;

/* JADX INFO: renamed from: co.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C11818h {

    /* JADX INFO: renamed from: a */
    public final C0556b f35822a;

    /* JADX INFO: renamed from: b */
    public final CharsetDecoder f35823b;

    /* JADX INFO: renamed from: c */
    public final ByteBuffer f35824c;

    /* JADX INFO: renamed from: d */
    public boolean f35825d;

    /* JADX INFO: renamed from: e */
    public char f35826e;

    public C11818h(C0556b c0556b, Charset charset) {
        byte[] bArr;
        AbstractC16544l.m18094g(charset, "charset");
        this.f35822a = c0556b;
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        this.f35823b = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        C11815e c11815e = C11815e.f35818o0;
        synchronized (c11815e) {
            C17677k c17677k = (C17677k) c11815e.f11539Z;
            byte[] bArr2 = (byte[]) (c17677k.isEmpty() ? null : c17677k.removeLast());
            bArr = bArr2 != null ? bArr2 : null;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr == null ? new byte[8196] : bArr);
        this.f35824c = byteBufferWrap;
        byteBufferWrap.flip();
    }

    /* JADX INFO: renamed from: a */
    public final int m13094a(char[] cArr, int i10, int i11) throws CharacterCodingException {
        int i12;
        CharsetDecoder charsetDecoder;
        char c9;
        char c10;
        char c11;
        char c12;
        if (i11 == 0) {
            return 0;
        }
        if (i10 < 0 || i10 >= cArr.length || i11 < 0 || i10 + i11 > cArr.length) {
            StringBuilder sbM21e = AbstractC0010F.m21e("Unexpected arguments: ", i10, ", ", i11, ", ");
            sbM21e.append(cArr.length);
            throw new IllegalArgumentException(sbM21e.toString().toString());
        }
        boolean z6 = true;
        if (this.f35825d) {
            cArr[i10] = this.f35826e;
            i10++;
            i11--;
            this.f35825d = false;
            if (i11 == 0) {
                return 1;
            }
            i12 = 1;
        } else {
            i12 = 0;
        }
        if (i11 == 1) {
            if (this.f35825d) {
                this.f35825d = false;
                c12 = this.f35826e;
            } else {
                char[] cArr2 = new char[2];
                int iM13094a = m13094a(cArr2, 0, 2);
                if (iM13094a == -1) {
                    c9 = 65535;
                } else if (iM13094a == 1) {
                    c10 = cArr2[0];
                } else {
                    if (iM13094a != 2) {
                        throw new IllegalStateException(("Unreachable state: " + iM13094a).toString());
                    }
                    this.f35826e = cArr2[1];
                    this.f35825d = true;
                    c11 = cArr2[0];
                }
            }
            if (c9 != 65535) {
                c9 = c10;
                c9 = c11;
                c9 = c12;
                cArr[i10] = c9;
                return i12 + 1;
            }
            if (i12 == 0) {
                return -1;
            }
            return i12;
        }
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr, i10, i11);
        if (charBufferWrap.position() != 0) {
            charBufferWrap = charBufferWrap.slice();
        }
        CharBuffer charBuffer = charBufferWrap;
        boolean z10 = false;
        while (true) {
            charsetDecoder = this.f35823b;
            ByteBuffer byteBuffer = this.f35824c;
            CoderResult coderResultDecode = charsetDecoder.decode(byteBuffer, charBuffer, z10);
            if (coderResultDecode.isUnderflow()) {
                if (z10 || !charBuffer.hasRemaining()) {
                    z6 = z10;
                    break;
                }
                byteBuffer.compact();
                try {
                    int iLimit = byteBuffer.limit();
                    int iPosition = byteBuffer.position();
                    int iRemaining = this.f35822a.read(byteBuffer.array(), byteBuffer.arrayOffset() + iPosition, iPosition <= iLimit ? iLimit - iPosition : 0);
                    if (iRemaining < 0) {
                        byteBuffer.flip();
                    } else {
                        byteBuffer.position(iPosition + iRemaining);
                        byteBuffer.flip();
                        iRemaining = byteBuffer.remaining();
                    }
                    if (iRemaining < 0) {
                        if (charBuffer.position() == 0 && !byteBuffer.hasRemaining()) {
                            break;
                        }
                        charsetDecoder.reset();
                        z10 = true;
                    } else {
                        continue;
                    }
                } catch (Throwable th2) {
                    byteBuffer.flip();
                    throw th2;
                }
            } else {
                if (coderResultDecode.isOverflow()) {
                    charBuffer.position();
                    z6 = z10;
                    break;
                }
                coderResultDecode.throwException();
            }
        }
        if (z6) {
            charsetDecoder.reset();
        }
        return (charBuffer.position() != 0 ? charBuffer.position() : -1) + i12;
    }
}
