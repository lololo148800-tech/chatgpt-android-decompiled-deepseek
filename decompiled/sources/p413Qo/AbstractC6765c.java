package p413Qo;

/* JADX INFO: renamed from: Qo.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6765c {

    /* JADX INFO: renamed from: a */
    public static final double[][] f21696a;

    /* JADX INFO: renamed from: b */
    public static final double[] f21697b;

    /* JADX INFO: renamed from: c */
    public static final double[] f21698c;

    /* JADX INFO: renamed from: d */
    public static final double[] f21699d;

    /* JADX INFO: renamed from: e */
    public static final double[] f21700e;

    /* JADX INFO: renamed from: f */
    public static final long[] f21701f;

    /* JADX INFO: renamed from: g */
    public static final long[] f21702g;

    /* JADX INFO: renamed from: h */
    public static final double[] f21703h;

    static {
        StrictMath.log(Double.MAX_VALUE);
        f21696a = new double[][]{new double[]{1.0d, 5.669184079525E-24d}, new double[]{-0.25d, -0.25d}, new double[]{0.3333333134651184d, 1.986821492305628E-8d}, new double[]{-0.25d, -6.663542893624021E-14d}, new double[]{0.19999998807907104d, 1.1921056801463227E-8d}, new double[]{-0.1666666567325592d, -7.800414592973399E-9d}, new double[]{0.1428571343421936d, 5.650007086920087E-9d}, new double[]{-0.12502530217170715d, -7.44321345601866E-11d}, new double[]{0.11113807559013367d, 9.219544613762692E-9d}};
        f21697b = new double[]{0.0d, 0.1246747374534607d, 0.24740394949913025d, 0.366272509098053d, 0.4794255495071411d, 0.5850973129272461d, 0.6816387176513672d, 0.7675435543060303d, 0.8414709568023682d, 0.902267575263977d, 0.9489846229553223d, 0.9808930158615112d, 0.9974949359893799d, 0.9985313415527344d};
        f21698c = new double[]{0.0d, -4.068233003401932E-9d, 9.755392680573412E-9d, 1.9987994582857286E-8d, -1.0902938113007961E-8d, -3.9986783938944604E-8d, 4.23719669792332E-8d, -5.207000323380292E-8d, 2.800552834259E-8d, 1.883511811213715E-8d, -3.5997360512765566E-9d, 4.116164446561962E-8d, 5.0614674548127384E-8d, -1.0129027912496858E-9d};
        f21699d = new double[]{1.0d, 0.9921976327896118d, 0.9689123630523682d, 0.9305076599121094d, 0.8775825500488281d, 0.8109631538391113d, 0.7316888570785522d, 0.6409968137741089d, 0.5403022766113281d, 0.4311765432357788d, 0.3153223395347595d, 0.19454771280288696d, 0.07073719799518585d, -0.05417713522911072d};
        f21700e = new double[]{0.0d, 3.4439717236742845E-8d, 5.865827662008209E-8d, -3.7999795083850525E-8d, 1.184154459111628E-8d, -3.43338934259355E-8d, 1.1795268640216787E-8d, 4.438921624363781E-8d, 2.925681159240093E-8d, -2.6437112632041807E-8d, 2.2860509143963117E-8d, -4.813899778443457E-9d, 3.6725170580355583E-9d, 2.0217439756338078E-10d};
        f21701f = new long[]{2935890503282001226L, 9154082963658192752L, 3952090531849364496L, 9193070505571053912L, 7910884519577875640L, 113236205062349959L, 4577762542105553359L, -5034868814120038111L, 4208363204685324176L, 5648769086999809661L, 2819561105158720014L, -4035746434778044925L, -302932621132653753L, -2644281811660520851L, -3183605296591799669L, 6722166367014452318L, -3512299194304650054L, -7278142539171889152L};
        f21702g = new long[]{-3958705157555305932L, -4267615245585081135L};
        f21703h = new double[]{0.0d, 0.125d, 0.25d, 0.375d, 0.5d, 0.625d, 0.75d, 0.875d, 1.0d, 1.125d, 1.25d, 1.375d, 1.5d, 1.625d};
    }

    /* JADX INFO: renamed from: a */
    public static double m7193a(double d10) {
        double d11;
        if (d10 != d10) {
            return d10;
        }
        if (d10 == d10 && d10 < 4.503599627370496E15d && d10 > -4.503599627370496E15d) {
            long j10 = (long) d10;
            if (d10 < 0.0d && j10 != d10) {
                j10--;
            }
            d11 = j10 == 0 ? j10 * d10 : j10;
        } else {
            d11 = d10;
        }
        if (d11 == d10) {
            return d11;
        }
        double d12 = d11 + 1.0d;
        return d12 == 0.0d ? d10 * d12 : d12;
    }

    /* JADX INFO: renamed from: b */
    public static double m7194b(double d10) {
        double dM7200h;
        double d11 = 0.0d;
        if (d10 < 0.0d) {
            d10 = -d10;
        }
        if (d10 != d10 || d10 == Double.POSITIVE_INFINITY) {
            return Double.NaN;
        }
        int i10 = 0;
        if (d10 > 3294198.0d) {
            double[] dArr = new double[3];
            m7198f(d10, dArr);
            i10 = ((int) dArr[0]) & 3;
            d10 = dArr[1];
            d11 = dArr[2];
        } else if (d10 > 1.5707963267948966d) {
            C6763a c6763a = new C6763a(d10);
            i10 = c6763a.f21692a & 3;
            d10 = c6763a.f21693b;
            d11 = c6763a.f21694c;
        }
        if (i10 == 0) {
            return m7195c(d10, d11);
        }
        if (i10 == 1) {
            dM7200h = m7200h(d10, d11);
        } else {
            if (i10 != 2) {
                if (i10 != 3) {
                    return Double.NaN;
                }
                return m7200h(d10, d11);
            }
            dM7200h = m7195c(d10, d11);
        }
        return -dM7200h;
    }

    /* JADX INFO: renamed from: c */
    public static double m7195c(double d10, double d11) {
        double d12 = 1.5707963267948966d - d10;
        return m7200h(d12, (6.123233995736766E-17d - d11) + (-((d12 - 1.5707963267948966d) + d10)));
    }

    /* JADX INFO: renamed from: d */
    public static double m7196d(double d10) {
        if (d10 == 0.0d) {
            return Double.NEGATIVE_INFINITY;
        }
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10);
        if (((Long.MIN_VALUE & jDoubleToRawLongBits) != 0 || d10 != d10) && d10 != 0.0d) {
            return Double.NaN;
        }
        if (d10 == Double.POSITIVE_INFINITY) {
            return Double.POSITIVE_INFINITY;
        }
        int i10 = ((int) (jDoubleToRawLongBits >> 52)) - 1023;
        if ((9218868437227405312L & jDoubleToRawLongBits) == 0) {
            if (d10 == 0.0d) {
                return Double.NEGATIVE_INFINITY;
            }
            jDoubleToRawLongBits <<= 1;
            while ((4503599627370496L & jDoubleToRawLongBits) == 0) {
                i10--;
                jDoubleToRawLongBits <<= 1;
            }
        }
        if ((i10 != -1 && i10 != 0) || d10 >= 1.01d || d10 <= 0.99d) {
            long j10 = 4499201580859392L & jDoubleToRawLongBits;
            double[] dArr = AbstractC6764b.f21695a[(int) (j10 >> 42)];
            double d11 = (jDoubleToRawLongBits & 4398046511103L) / (j10 + 4.503599627370496E15d);
            double d12 = (((((((((((-0.16624882440418567d) * d11) + 0.19999954120254515d) * d11) - 0.2499999997677497d) * d11) + 0.3333333333332802d) * d11) - 0.5d) * d11) + 1.0d) * d11;
            double d13 = i10;
            double d14 = 0.6931470632553101d * d13;
            double d15 = dArr[0];
            double d16 = d14 + d15;
            double d17 = (-((d16 - d14) - d15)) + 0.0d;
            double d18 = d16 + d12;
            double d19 = d17 + (-((d18 - d16) - d12));
            double d20 = d13 * 1.1730463525082348E-7d;
            double d21 = d18 + d20;
            double d22 = d19 + (-((d21 - d18) - d20));
            double d23 = dArr[1];
            double d24 = d21 + d23;
            double d25 = d24 + 0.0d;
            return d22 + (-((d24 - d21) - d23)) + (-((d25 - d24) - 0.0d)) + d25;
        }
        double d26 = d10 - 1.0d;
        double d27 = d26 * 1.073741824E9d;
        double d28 = (d26 + d27) - d27;
        double d29 = d26 - d28;
        double[][] dArr2 = f21696a;
        double[] dArr3 = dArr2[dArr2.length - 1];
        double d30 = dArr3[0];
        double d31 = dArr3[1];
        for (int length = dArr2.length - 2; length >= 0; length--) {
            double d32 = d30 * d28;
            double d33 = (d31 * d29) + (d31 * d28) + (d30 * d29);
            double d34 = d32 * 1.073741824E9d;
            double d35 = (d32 + d34) - d34;
            double d36 = (d32 - d35) + d33;
            double[] dArr4 = dArr2[length];
            double d37 = d35 + dArr4[0];
            double d38 = d37 * 1.073741824E9d;
            d30 = (d37 + d38) - d38;
            d31 = (d37 - d30) + d36 + dArr4[1];
        }
        double d39 = d30 * d28;
        double d40 = (d31 * d29) + (d28 * d31) + (d30 * d29);
        double d41 = 1.073741824E9d * d39;
        double d42 = (d39 + d41) - d41;
        return (d39 - d42) + d40 + d42;
    }

    /* JADX INFO: renamed from: e */
    public static long m7197e(long j10, long j11) {
        return j10 <= j11 ? j10 : j11;
    }

    /* JADX INFO: renamed from: f */
    public static void m7198f(double d10, double[] dArr) {
        long j10;
        long j11;
        long j12;
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10);
        int i10 = ((int) ((jDoubleToRawLongBits >> 52) & 2047)) - 1022;
        long j13 = ((jDoubleToRawLongBits & 4503599627370495L) | 4503599627370496L) << 11;
        int i11 = i10 >> 6;
        int i12 = i10 - (i11 << 6);
        long[] jArr = f21701f;
        if (i12 != 0) {
            long j14 = i11 == 0 ? 0L : jArr[i11 - 1] << i12;
            long j15 = jArr[i11];
            int i13 = 64 - i12;
            j10 = j14 | (j15 >>> i13);
            long j16 = jArr[i11 + 1];
            j11 = (j15 << i12) | (j16 >>> i13);
            j12 = (jArr[i11 + 2] >>> i13) | (j16 << i12);
        } else {
            j10 = i11 == 0 ? 0L : jArr[i11 - 1];
            j11 = jArr[i11];
            j12 = jArr[i11 + 1];
        }
        long j17 = j13 >>> 32;
        long j18 = j13 & 4294967295L;
        long j19 = j11 >>> 32;
        long j20 = j11 & 4294967295L;
        long j21 = j17 * j19;
        long j22 = j18 * j20;
        long j23 = j19 * j18;
        long j24 = j20 * j17;
        long j25 = j22 + (j24 << 32);
        long j26 = j21 + (j24 >>> 32);
        boolean z6 = (j22 & Long.MIN_VALUE) != 0;
        boolean z10 = (j24 & 2147483648L) != 0;
        long j27 = j25 & Long.MIN_VALUE;
        boolean z11 = j27 != 0;
        if ((z6 && z10) || ((z6 || z10) && !z11)) {
            j26++;
        }
        boolean z12 = j27 != 0;
        boolean z13 = (j23 & 2147483648L) != 0;
        long j28 = j25 + (j23 << 32);
        long j29 = j26 + (j23 >>> 32);
        long j30 = j28 & Long.MIN_VALUE;
        boolean z14 = j30 != 0;
        if ((z12 && z13) || ((z12 || z13) && !z14)) {
            j29++;
        }
        long j31 = j12 >>> 32;
        long j32 = (j17 * j31) + ((((j12 & 4294967295L) * j17) + (j31 * j18)) >>> 32);
        boolean z15 = j30 != 0;
        boolean z16 = (j32 & Long.MIN_VALUE) != 0;
        long j33 = j28 + j32;
        boolean z17 = (j33 & Long.MIN_VALUE) != 0;
        if ((z15 && z16) || ((z15 || z16) && !z17)) {
            j29++;
        }
        long j34 = j10 >>> 32;
        long j35 = j10 & 4294967295L;
        long j36 = (j18 * j35) + (((j17 * j35) + (j18 * j34)) << 32) + j29;
        int i14 = (int) (j36 >>> 62);
        long j37 = (j36 << 2) | (j33 >>> 62);
        long j38 = j33 << 2;
        long j39 = j37 >>> 32;
        long j40 = j37 & 4294967295L;
        long[] jArr2 = f21702g;
        long j41 = jArr2[0];
        long j42 = j41 >>> 32;
        long j43 = j41 & 4294967295L;
        long j44 = j40 * j43;
        long j45 = j40 * j42;
        long j46 = j39 * j43;
        long j47 = j44 + (j46 << 32);
        long j48 = (j39 * j42) + (j46 >>> 32);
        boolean z18 = (j44 & Long.MIN_VALUE) != 0;
        boolean z19 = (j46 & 2147483648L) != 0;
        long j49 = j47 & Long.MIN_VALUE;
        boolean z20 = j49 != 0;
        if ((z18 && z19) || ((z18 || z19) && !z20)) {
            j48++;
        }
        boolean z21 = j49 != 0;
        boolean z22 = (j45 & 2147483648L) != 0;
        long j50 = j47 + (j45 << 32);
        long j51 = j48 + (j45 >>> 32);
        long j52 = j50 & Long.MIN_VALUE;
        boolean z23 = j52 != 0;
        if ((z21 && z22) || ((z21 || z22) && !z23)) {
            j51++;
        }
        long j53 = jArr2[1];
        long j54 = j53 >>> 32;
        long j55 = (j39 * j54) + (((j39 * (j53 & 4294967295L)) + (j40 * j54)) >>> 32);
        boolean z24 = j52 != 0;
        boolean z25 = (j55 & Long.MIN_VALUE) != 0;
        long j56 = j50 + j55;
        long j57 = j56 & Long.MIN_VALUE;
        boolean z26 = j57 != 0;
        if ((z24 && z25) || ((z24 || z25) && !z26)) {
            j51++;
        }
        long j58 = j38 >>> 32;
        long j59 = (j58 * j42) + (((j58 * j43) + ((j38 & 4294967295L) * j42)) >>> 32);
        boolean z27 = j57 != 0;
        boolean z28 = (j59 & Long.MIN_VALUE) != 0;
        long j60 = j56 + j59;
        boolean z29 = (j60 & Long.MIN_VALUE) != 0;
        if ((z27 && z28) || ((z27 || z28) && !z29)) {
            j51++;
        }
        double d11 = (j51 >>> 12) / 4.503599627370496E15d;
        double d12 = ((((j51 & 4095) << 40) + (j60 >>> 24)) / 4.503599627370496E15d) / 4.503599627370496E15d;
        double d13 = d11 + d12;
        dArr[0] = i14;
        dArr[1] = d13 * 2.0d;
        dArr[2] = (-((d13 - d11) - d12)) * 2.0d;
    }

    /* JADX INFO: renamed from: g */
    public static double m7199g(double d10) {
        double d11;
        boolean z6;
        double dM7200h;
        double d12 = 0.0d;
        int i10 = 0;
        if (d10 < 0.0d) {
            d11 = -d10;
            z6 = true;
        } else {
            d11 = d10;
            z6 = false;
        }
        if (d11 == 0.0d) {
            return Double.doubleToRawLongBits(d10) < 0 ? -0.0d : 0.0d;
        }
        if (d11 != d11 || d11 == Double.POSITIVE_INFINITY) {
            return Double.NaN;
        }
        if (d11 > 3294198.0d) {
            double[] dArr = new double[3];
            m7198f(d11, dArr);
            i10 = ((int) dArr[0]) & 3;
            d11 = dArr[1];
            d12 = dArr[2];
        } else if (d11 > 1.5707963267948966d) {
            C6763a c6763a = new C6763a(d11);
            i10 = c6763a.f21692a & 3;
            d11 = c6763a.f21693b;
            d12 = c6763a.f21694c;
        }
        if (z6) {
            i10 ^= 2;
        }
        if (i10 == 0) {
            return m7200h(d11, d12);
        }
        if (i10 == 1) {
            return m7195c(d11, d12);
        }
        if (i10 == 2) {
            dM7200h = m7200h(d11, d12);
        } else {
            if (i10 != 3) {
                return Double.NaN;
            }
            dM7200h = m7195c(d11, d12);
        }
        return -dM7200h;
    }

    /* JADX INFO: renamed from: h */
    public static double m7200h(double d10, double d11) {
        int i10 = (int) ((8.0d * d10) + 0.5d);
        double d12 = d10 - f21703h[i10];
        double d13 = f21697b[i10];
        double d14 = f21698c[i10];
        double d15 = f21699d[i10];
        double d16 = f21700e[i10];
        double d17 = d12 * d12;
        double d18 = ((((((2.7553817452272217E-6d * d17) - 1.9841269659586505E-4d) * d17) + 0.008333333333329196d) * d17) - 0.16666666666666666d) * d17 * d12;
        double d19 = ((((((2.479773539153719E-5d * d17) - 0.0013888888689039883d) * d17) + 0.041666666666621166d) * d17) - 0.49999999999999994d) * d17;
        double d20 = 1.073741824E9d * d12;
        double d21 = (d12 + d20) - d20;
        double d22 = (d12 - d21) + d18;
        double d23 = d13 + 0.0d;
        double d24 = d15 * d21;
        double d25 = d23 + d24;
        double d26 = (d16 * d22) + (d14 * d19) + (d16 * d21) + (d15 * d22) + (d13 * d19) + (-((d23 - 0.0d) - d13)) + 0.0d + (-((d25 - d23) - d24)) + d14;
        if (d11 != 0.0d) {
            double d27 = (((d19 + 1.0d) * (d15 + d16)) - ((d21 + d22) * (d13 + d14))) * d11;
            double d28 = d25 + d27;
            d26 += -((d28 - d25) - d27);
            d25 = d28;
        }
        return d25 + d26;
    }
}
