package p523V9;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p033B5.AbstractC0833q;
import p033B5.C0825i;
import p184H5.C3234a;
import p184H5.C3242i;
import p374P5.AbstractC6356i;
import p374P5.C6354g;
import p374P5.C6361n;
import p397Q5.C6579h;
import p397Q5.EnumC6575d;
import p496U5.AbstractC7568j;
import p571X9.AbstractC9143H4;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17678l;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: V9.i6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8112i6 {
    /* JADX INFO: renamed from: a */
    public static final long m8603a(float f10, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    /* JADX INFO: renamed from: b */
    public static final byte[] m8604b(CharsetEncoder charsetEncoder, CharSequence input, int i10, int i11) throws CharacterCodingException {
        AbstractC16544l.m18094g(charsetEncoder, "<this>");
        AbstractC16544l.m18094g(input, "input");
        if (input instanceof String) {
            if (i10 == 0) {
                String str = (String) input;
                if (i11 == str.length()) {
                    byte[] bytes = str.getBytes(charsetEncoder.charset());
                    AbstractC16544l.m18093f(bytes, "getBytes(...)");
                    return bytes;
                }
            }
            String strSubstring = ((String) input).substring(i10, i11);
            AbstractC16544l.m18093f(strSubstring, "substring(...)");
            byte[] bytes2 = strSubstring.getBytes(charsetEncoder.charset());
            AbstractC16544l.m18093f(bytes2, "getBytes(...)");
            return bytes2;
        }
        ByteBuffer byteBufferEncode = charsetEncoder.encode(CharBuffer.wrap(input, i10, i11));
        byte[] bArr = null;
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            byte[] bArrArray = byteBufferEncode.array();
            if (bArrArray.length == byteBufferEncode.remaining()) {
                bArr = bArrArray;
            }
        }
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr2);
        return bArr2;
    }

    /* JADX INFO: renamed from: c */
    public static final long m8605c(long j10) {
        if (j10 != 9205357640488583168L) {
            return AbstractC8088f6.m8536b(Float.intBitsToFloat((int) (j10 >> 32)) / 2.0f, Float.intBitsToFloat((int) (j10 & 4294967295L)) / 2.0f);
        }
        throw new IllegalStateException("Size is unspecified");
    }

    /* JADX INFO: renamed from: d */
    public static final String m8606d(Charset charset) {
        AbstractC16544l.m18094g(charset, "<this>");
        String strName = charset.name();
        AbstractC16544l.m18093f(strName, "name(...)");
        return strName;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public static final C3234a m8607e(C3234a c3234a, C6354g c6354g, C6361n c6361n, C0825i c0825i, AbstractC19687c abstractC19687c) {
        C3242i c3242i;
        boolean z6;
        Bitmap bitmapM9687a;
        C3234a c3234a2;
        int size;
        C6354g c6354g2;
        int i10;
        C6361n c6361n2;
        List list;
        Bitmap bitmap;
        if (abstractC19687c instanceof C3242i) {
            c3242i = (C3242i) abstractC19687c;
            int i11 = c3242i.f9874u0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3242i.f9874u0 = i11 - Integer.MIN_VALUE;
            } else {
                c3242i = new C3242i(abstractC19687c);
            }
        } else {
            c3242i = new C3242i(abstractC19687c);
        }
        Object obj = c3242i.f9873t0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i12 = c3242i.f9874u0;
        if (i12 == 0) {
            AbstractC9233X.m9807c(obj);
            List list2 = (List) AbstractC0833q.m1891d(c6354g, AbstractC6356i.f20684a);
            if (list2.isEmpty()) {
                return c3234a;
            }
            Drawable drawableM1889b = AbstractC0833q.m1889b(c3234a.f9806a, c6354g.f20661a.getResources());
            boolean z10 = drawableM1889b instanceof BitmapDrawable;
            if (!z10 && !((Boolean) AbstractC0833q.m1891d(c6354g, AbstractC6356i.f20690g)).booleanValue()) {
                return c3234a;
            }
            if (z10) {
                Bitmap bitmap2 = ((BitmapDrawable) drawableM1889b).getBitmap();
                Bitmap.Config config = bitmap2.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (AbstractC17678l.m19298e(config, AbstractC7568j.f23971a)) {
                    bitmapM9687a = bitmap2;
                } else {
                    Bitmap.Config configM6975b = AbstractC6356i.m6975b(c6361n);
                    if (c6361n.f20700d == EnumC6575d.f21259Z) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    bitmapM9687a = AbstractC9143H4.m9687a(drawableM1889b, configM6975b, c6361n.f20698b, c6361n.f20699c, z6);
                }
            } else {
                Bitmap.Config configM6975b2 = AbstractC6356i.m6975b(c6361n);
                if (c6361n.f20700d == EnumC6575d.f21259Z) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                bitmapM9687a = AbstractC9143H4.m9687a(drawableM1889b, configM6975b2, c6361n.f20698b, c6361n.f20699c, z6);
            }
            c0825i.getClass();
            c3234a2 = c3234a;
            size = list2.size();
            c6354g2 = c6354g;
            i10 = 0;
            Bitmap bitmap3 = bitmapM9687a;
            c6361n2 = c6361n;
            list = list2;
            bitmap = bitmap3;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            size = c3242i.f9872s0;
            int i13 = c3242i.f9871r0;
            list = c3242i.f9870q0;
            c0825i = c3242i.f9869p0;
            c6361n2 = c3242i.f9868o0;
            c6354g2 = c3242i.f9867Z;
            c3234a2 = c3242i.f9866Y;
            AbstractC9233X.m9807c(obj);
            bitmap = (Bitmap) obj;
            AbstractC0575H.m1187p(c3242i.getContext());
            i10 = i13 + 1;
        }
        if (i10 >= size) {
            c0825i.getClass();
            return new C3234a(AbstractC0833q.m1890c(new BitmapDrawable(c6354g2.f20661a.getResources(), bitmap)), c3234a2.f9807b, c3234a2.f9808c, c3234a2.f9809d);
        }
        if (list.get(i10) != null) {
            throw new ClassCastException();
        }
        C6579h c6579h = c6361n2.f20698b;
        c3242i.f9866Y = c3234a2;
        c3242i.f9867Z = c6354g2;
        c3242i.f9868o0 = c6361n2;
        c3242i.f9869p0 = c0825i;
        c3242i.f9870q0 = list;
        c3242i.f9871r0 = i10;
        c3242i.f9872s0 = size;
        c3242i.f9874u0 = 1;
        throw null;
    }
}
