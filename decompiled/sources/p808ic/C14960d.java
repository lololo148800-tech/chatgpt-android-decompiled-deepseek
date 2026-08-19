package p808ic;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ic.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C14960d {

    /* JADX INFO: renamed from: c */
    public static final ArrayList f46596c = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final CharsetEncoder[] f46597a;

    /* JADX INFO: renamed from: b */
    public final int f46598b;

    static {
        String[] strArr = {"IBM437", "ISO-8859-2", "ISO-8859-3", "ISO-8859-4", "ISO-8859-5", "ISO-8859-6", "ISO-8859-7", "ISO-8859-8", "ISO-8859-9", "ISO-8859-10", "ISO-8859-11", "ISO-8859-13", "ISO-8859-14", "ISO-8859-15", "ISO-8859-16", "windows-1250", "windows-1251", "windows-1252", "windows-1256", "Shift_JIS"};
        for (int i10 = 0; i10 < 20; i10++) {
            String str = strArr[i10];
            if (((EnumC14959c) EnumC14959c.f46592p0.get(str)) != null) {
                try {
                    f46596c.add(Charset.forName(str).newEncoder());
                } catch (UnsupportedCharsetException unused) {
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C14960d(String str, Charset charset) {
        int i10;
        boolean z6;
        ArrayList arrayList = new ArrayList();
        arrayList.add(StandardCharsets.ISO_8859_1.newEncoder());
        int i11 = 0;
        boolean z10 = charset != null && charset.name().startsWith("UTF");
        int i12 = 0;
        while (true) {
            i10 = -1;
            if (i12 >= str.length()) {
                break;
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z6 = false;
                    break;
                }
                CharsetEncoder charsetEncoder = (CharsetEncoder) it.next();
                char cCharAt = str.charAt(i12);
                if (cCharAt == -1 || charsetEncoder.canEncode(cCharAt)) {
                    z6 = true;
                    break;
                }
            }
            if (!z6) {
                for (CharsetEncoder charsetEncoder2 : f46596c) {
                    if (charsetEncoder2.canEncode(str.charAt(i12))) {
                        arrayList.add(charsetEncoder2);
                        z6 = true;
                        break;
                    }
                }
            }
            if (!z6) {
                z10 = true;
            }
            i12++;
        }
        if (arrayList.size() != 1 || z10) {
            this.f46597a = new CharsetEncoder[arrayList.size() + 2];
            Iterator it2 = arrayList.iterator();
            int i13 = 0;
            while (it2.hasNext()) {
                this.f46597a[i13] = (CharsetEncoder) it2.next();
                i13++;
            }
            this.f46597a[i13] = StandardCharsets.UTF_8.newEncoder();
            this.f46597a[i13 + 1] = StandardCharsets.UTF_16BE.newEncoder();
        } else {
            this.f46597a = new CharsetEncoder[]{(CharsetEncoder) arrayList.get(0)};
        }
        if (charset != null) {
            while (true) {
                CharsetEncoder[] charsetEncoderArr = this.f46597a;
                if (i11 >= charsetEncoderArr.length) {
                    break;
                }
                if (charsetEncoderArr[i11] != null && charset.name().equals(this.f46597a[i11].charset().name())) {
                    i10 = i11;
                    break;
                }
                i11++;
            }
        }
        this.f46598b = i10;
    }
}
