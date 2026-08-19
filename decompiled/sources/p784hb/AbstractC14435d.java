package p784hb;

import java.lang.reflect.Array;
import java.math.BigInteger;
import p813ij.C15026j;

/* JADX INFO: renamed from: hb.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14435d {

    /* JADX INFO: renamed from: a */
    public static final long[] f45404a;

    /* JADX INFO: renamed from: b */
    public static final long[] f45405b;

    /* JADX INFO: renamed from: c */
    public static final long[] f45406c;

    /* JADX INFO: renamed from: d */
    public static final C14432a[][] f45407d;

    /* JADX INFO: renamed from: e */
    public static final C14432a[] f45408e;

    /* JADX INFO: renamed from: f */
    public static final BigInteger f45409f;

    /* JADX INFO: renamed from: g */
    public static final BigInteger f45410g;

    /* JADX INFO: renamed from: h */
    public static final BigInteger f45411h;

    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        f45409f = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        f45410g = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        f45411h = bigIntegerMod2;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerModPow = bigIntegerValueOf.modPow(bigIntegerSubtract.subtract(bigInteger).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        C15026j c15026j = new C15026j();
        BigInteger bigIntegerMod3 = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        c15026j.f46725Z = bigIntegerMod3;
        BigInteger bigIntegerMultiply = bigIntegerMod3.pow(2).subtract(bigInteger).multiply(bigIntegerMod.multiply(bigIntegerMod3.pow(2)).add(bigInteger).modInverse(bigIntegerSubtract));
        BigInteger bigIntegerModPow2 = bigIntegerMultiply.modPow(bigIntegerSubtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigIntegerSubtract);
        if (!bigIntegerModPow2.pow(2).subtract(bigIntegerMultiply).mod(bigIntegerSubtract).equals(BigInteger.ZERO)) {
            bigIntegerModPow2 = bigIntegerModPow2.multiply(bigIntegerModPow).mod(bigIntegerSubtract);
        }
        if (bigIntegerModPow2.testBit(0)) {
            bigIntegerModPow2 = bigIntegerSubtract.subtract(bigIntegerModPow2);
        }
        c15026j.f46724Y = bigIntegerModPow2;
        f45404a = AbstractC14434c.m15939d(m15952c(bigIntegerMod));
        f45405b = AbstractC14434c.m15939d(m15952c(bigIntegerMod2));
        f45406c = AbstractC14434c.m15939d(m15952c(bigIntegerModPow));
        f45407d = (C14432a[][]) Array.newInstance((Class<?>) C14432a.class, 32, 8);
        C15026j c15026jM15950a = c15026j;
        for (int i10 = 0; i10 < 32; i10++) {
            C15026j c15026jM15950a2 = c15026jM15950a;
            for (int i11 = 0; i11 < 8; i11++) {
                f45407d[i10][i11] = m15951b(c15026jM15950a2);
                c15026jM15950a2 = m15950a(c15026jM15950a2, c15026jM15950a);
            }
            for (int i12 = 0; i12 < 8; i12++) {
                c15026jM15950a = m15950a(c15026jM15950a, c15026jM15950a);
            }
        }
        C15026j c15026jM15950a3 = m15950a(c15026j, c15026j);
        f45408e = new C14432a[8];
        for (int i13 = 0; i13 < 8; i13++) {
            f45408e[i13] = m15951b(c15026j);
            c15026j = m15950a(c15026j, c15026jM15950a3);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C15026j m15950a(C15026j c15026j, C15026j c15026j2) {
        C15026j c15026j3 = new C15026j();
        BigInteger bigIntegerMultiply = f45410g.multiply(((BigInteger) c15026j.f46724Y).multiply((BigInteger) c15026j2.f46724Y).multiply((BigInteger) c15026j.f46725Z).multiply((BigInteger) c15026j2.f46725Z));
        BigInteger bigInteger = f45409f;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        BigInteger bigIntegerAdd = ((BigInteger) c15026j.f46724Y).multiply((BigInteger) c15026j2.f46725Z).add(((BigInteger) c15026j2.f46724Y).multiply((BigInteger) c15026j.f46725Z));
        BigInteger bigInteger2 = BigInteger.ONE;
        c15026j3.f46724Y = bigIntegerAdd.multiply(bigInteger2.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        c15026j3.f46725Z = ((BigInteger) c15026j.f46725Z).multiply((BigInteger) c15026j2.f46725Z).add(((BigInteger) c15026j.f46724Y).multiply((BigInteger) c15026j2.f46724Y)).multiply(bigInteger2.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        return c15026j3;
    }

    /* JADX INFO: renamed from: b */
    public static C14432a m15951b(C15026j c15026j) {
        BigInteger bigIntegerAdd = ((BigInteger) c15026j.f46725Z).add((BigInteger) c15026j.f46724Y);
        BigInteger bigInteger = f45409f;
        return new C14432a(AbstractC14434c.m15939d(m15952c(bigIntegerAdd.mod(bigInteger))), AbstractC14434c.m15939d(m15952c(((BigInteger) c15026j.f46725Z).subtract((BigInteger) c15026j.f46724Y).mod(bigInteger))), AbstractC14434c.m15939d(m15952c(f45411h.multiply((BigInteger) c15026j.f46724Y).multiply((BigInteger) c15026j.f46725Z).mod(bigInteger))));
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m15952c(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        System.arraycopy(byteArray, 0, bArr, 32 - byteArray.length, byteArray.length);
        for (int i10 = 0; i10 < 16; i10++) {
            byte b = bArr[i10];
            int i11 = 31 - i10;
            bArr[i10] = bArr[i11];
            bArr[i11] = b;
        }
        return bArr;
    }
}
