package p673c4;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p1016t3.C19753C;
import p479Td.AbstractC7360k;
import p589Y3.C9643a;
import p594Y9.AbstractC9997x4;
import p644ab.AbstractC10531d;

/* JADX INFO: renamed from: c4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C11645a extends AbstractC9997x4 {

    /* JADX INFO: renamed from: c */
    public static final Pattern f35274c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: a */
    public final CharsetDecoder f35275a = AbstractC10531d.f31242c.newDecoder();

    /* JADX INFO: renamed from: b */
    public final CharsetDecoder f35276b = AbstractC10531d.f31241b.newDecoder();

    @Override // p594Y9.AbstractC9997x4
    /* JADX INFO: renamed from: d */
    public final C19753C mo10641d(C9643a c9643a, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.f35276b;
        CharsetDecoder charsetDecoder2 = this.f35275a;
        String str = null;
        try {
            string = charsetDecoder2.decode(byteBuffer).toString();
            charsetDecoder2.reset();
            byteBuffer.rewind();
        } catch (CharacterCodingException unused) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            try {
                String string2 = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = string2;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th2;
            }
        } catch (Throwable th3) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            throw th3;
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new C19753C(new C11647c(null, null, bArr));
        }
        Matcher matcher = f35274c.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strM7787d = AbstractC7360k.m7787d(strGroup);
                strM7787d.getClass();
                if (strM7787d.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strM7787d.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new C19753C(new C11647c(str, str2, bArr));
    }
}
