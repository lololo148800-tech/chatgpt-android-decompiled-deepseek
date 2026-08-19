package p784hb;

import fo.C13711h;
import gb.AbstractC13835a;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import p658b5.C11234e;
import p658b5.C11241l;
import p807ib.C14956a;

/* JADX INFO: renamed from: hb.e */
/* JADX INFO: loaded from: classes.dex */
public final class C14436e {

    /* JADX INFO: renamed from: a */
    public final C14956a f45412a;

    public C14436e(byte[] bArr) {
        if (AbstractC13835a.f43871a.get()) {
            throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Given public key's length is not 32.");
        }
        this.f45412a = new C14956a(bArr.length, bArr);
    }

    /* JADX INFO: renamed from: a */
    public final void m15953a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        long[] jArr;
        C13711h c13711h;
        byte b;
        byte[] bArr3 = bArr;
        if (bArr3.length != 64) {
            throw new GeneralSecurityException("The length of the signature is not 64.");
        }
        byte[] bArr4 = this.f45412a.f46583a;
        byte[] bArr5 = new byte[bArr4.length];
        System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
        if (bArr3.length == 64) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr3, 32, 64);
            int i10 = 31;
            int i11 = 31;
            while (i11 >= 0) {
                int i12 = bArrCopyOfRange[i11] & 255;
                int i13 = AbstractC14434c.f45399b[i11] & 255;
                if (i12 != i13) {
                    if (i12 >= i13) {
                        break;
                    }
                    MessageDigest messageDigest = (MessageDigest) C14440i.f45415b.f45416a.mo15959t();
                    messageDigest.update(bArr3, 0, 32);
                    messageDigest.update(bArr5);
                    messageDigest.update(bArr2);
                    byte[] bArrDigest = messageDigest.digest();
                    long jM15940e = AbstractC14434c.m15940e(0, bArrDigest) & 2097151;
                    long jM15941f = (AbstractC14434c.m15941f(2, bArrDigest) >> 5) & 2097151;
                    long jM15940e2 = (AbstractC14434c.m15940e(5, bArrDigest) >> 2) & 2097151;
                    long jM15941f2 = (AbstractC14434c.m15941f(7, bArrDigest) >> 7) & 2097151;
                    long jM15941f3 = (AbstractC14434c.m15941f(10, bArrDigest) >> 4) & 2097151;
                    long jM15940e3 = (AbstractC14434c.m15940e(13, bArrDigest) >> 1) & 2097151;
                    long jM15941f4 = (AbstractC14434c.m15941f(15, bArrDigest) >> 6) & 2097151;
                    long jM15940e4 = (AbstractC14434c.m15940e(18, bArrDigest) >> 3) & 2097151;
                    long jM15940e5 = AbstractC14434c.m15940e(21, bArrDigest) & 2097151;
                    long jM15941f5 = (AbstractC14434c.m15941f(23, bArrDigest) >> 5) & 2097151;
                    long jM15940e6 = (AbstractC14434c.m15940e(26, bArrDigest) >> 2) & 2097151;
                    long jM15941f6 = (AbstractC14434c.m15941f(28, bArrDigest) >> 7) & 2097151;
                    long jM15941f7 = (AbstractC14434c.m15941f(i10, bArrDigest) >> 4) & 2097151;
                    long jM15940e7 = (AbstractC14434c.m15940e(34, bArrDigest) >> 1) & 2097151;
                    long jM15941f8 = (AbstractC14434c.m15941f(36, bArrDigest) >> 6) & 2097151;
                    long jM15940e8 = (AbstractC14434c.m15940e(39, bArrDigest) >> 3) & 2097151;
                    long jM15940e9 = AbstractC14434c.m15940e(42, bArrDigest) & 2097151;
                    long jM15941f9 = (AbstractC14434c.m15941f(44, bArrDigest) >> 5) & 2097151;
                    long jM15940e10 = (AbstractC14434c.m15940e(47, bArrDigest) >> 2) & 2097151;
                    long jM15941f10 = (AbstractC14434c.m15941f(49, bArrDigest) >> 7) & 2097151;
                    long jM15941f11 = (AbstractC14434c.m15941f(52, bArrDigest) >> 4) & 2097151;
                    long jM15940e11 = (AbstractC14434c.m15940e(55, bArrDigest) >> 1) & 2097151;
                    long jM15941f12 = (AbstractC14434c.m15941f(57, bArrDigest) >> 6) & 2097151;
                    long jM15941f13 = AbstractC14434c.m15941f(60, bArrDigest) >> 3;
                    long j10 = (jM15941f13 * 666643) + jM15941f6;
                    long j11 = (jM15941f13 * 470296) + jM15941f7;
                    long j12 = (jM15941f13 * 654183) + jM15940e7;
                    long j13 = jM15941f8 - (jM15941f13 * 997805);
                    long j14 = (jM15941f13 * 136657) + jM15940e8;
                    long j15 = jM15940e9 - (jM15941f13 * 683901);
                    long j16 = (jM15941f12 * 666643) + jM15940e6;
                    long j17 = (jM15941f12 * 470296) + j10;
                    long j18 = (jM15941f12 * 654183) + j11;
                    long j19 = j12 - (jM15941f12 * 997805);
                    long j20 = (jM15941f12 * 136657) + j13;
                    long j21 = j14 - (jM15941f12 * 683901);
                    long j22 = (jM15940e11 * 666643) + jM15941f5;
                    long j23 = (jM15940e11 * 470296) + j16;
                    long j24 = (jM15940e11 * 654183) + j17;
                    long j25 = j18 - (jM15940e11 * 997805);
                    long j26 = (jM15940e11 * 136657) + j19;
                    long j27 = j20 - (jM15940e11 * 683901);
                    long j28 = (jM15941f11 * 666643) + jM15940e5;
                    long j29 = (jM15941f11 * 470296) + j22;
                    long j30 = (jM15941f11 * 654183) + j23;
                    long j31 = j24 - (jM15941f11 * 997805);
                    long j32 = (jM15941f11 * 136657) + j25;
                    long j33 = j26 - (jM15941f11 * 683901);
                    long j34 = (jM15941f10 * 666643) + jM15940e4;
                    long j35 = (jM15941f10 * 470296) + j28;
                    long j36 = (jM15941f10 * 654183) + j29;
                    long j37 = j30 - (jM15941f10 * 997805);
                    long j38 = (jM15941f10 * 136657) + j31;
                    long j39 = j32 - (jM15941f10 * 683901);
                    long j40 = (jM15940e10 * 666643) + jM15941f4;
                    long j41 = (jM15940e10 * 470296) + j34;
                    long j42 = (jM15940e10 * 654183) + j35;
                    long j43 = j36 - (jM15940e10 * 997805);
                    long j44 = (jM15940e10 * 136657) + j37;
                    long j45 = j38 - (jM15940e10 * 683901);
                    long j46 = (j40 + 1048576) >> 21;
                    long j47 = j41 + j46;
                    long j48 = j40 - (j46 << 21);
                    long j49 = (j42 + 1048576) >> 21;
                    long j50 = j43 + j49;
                    long j51 = j42 - (j49 << 21);
                    long j52 = (j44 + 1048576) >> 21;
                    long j53 = j45 + j52;
                    long j54 = j44 - (j52 << 21);
                    long j55 = (j39 + 1048576) >> 21;
                    long j56 = j33 + j55;
                    long j57 = j39 - (j55 << 21);
                    long j58 = (j27 + 1048576) >> 21;
                    long j59 = j21 + j58;
                    long j60 = j27 - (j58 << 21);
                    long j61 = (j15 + 1048576) >> 21;
                    long j62 = jM15941f9 + j61;
                    long j63 = j15 - (j61 << 21);
                    long j64 = (j47 + 1048576) >> 21;
                    long j65 = j51 + j64;
                    long j66 = j47 - (j64 << 21);
                    long j67 = (j50 + 1048576) >> 21;
                    long j68 = j54 + j67;
                    long j69 = j50 - (j67 << 21);
                    long j70 = (j53 + 1048576) >> 21;
                    long j71 = j57 + j70;
                    long j72 = j53 - (j70 << 21);
                    long j73 = (j56 + 1048576) >> 21;
                    long j74 = j60 + j73;
                    long j75 = j56 - (j73 << 21);
                    long j76 = (j59 + 1048576) >> 21;
                    long j77 = j63 + j76;
                    long j78 = j59 - (j76 << 21);
                    long j79 = (j62 * 666643) + jM15940e3;
                    long j80 = (j62 * 470296) + j48;
                    long j81 = (j62 * 654183) + j66;
                    long j82 = j65 - (j62 * 997805);
                    long j83 = (j62 * 136657) + j69;
                    long j84 = j68 - (j62 * 683901);
                    long j85 = (j77 * 666643) + jM15941f3;
                    long j86 = (j77 * 470296) + j79;
                    long j87 = (j77 * 654183) + j80;
                    long j88 = j81 - (j77 * 997805);
                    long j89 = (j77 * 136657) + j82;
                    long j90 = j83 - (j77 * 683901);
                    long j91 = (j78 * 666643) + jM15941f2;
                    long j92 = (j78 * 470296) + j85;
                    long j93 = (j78 * 654183) + j86;
                    long j94 = (j78 * 136657) + j88;
                    long j95 = j89 - (j78 * 683901);
                    long j96 = (j74 * 666643) + jM15940e2;
                    long j97 = (j74 * 470296) + j91;
                    long j98 = (j74 * 654183) + j92;
                    long j99 = (j74 * 136657) + (j87 - (j78 * 997805));
                    long j100 = (j75 * 666643) + jM15941f;
                    long j101 = (j75 * 470296) + j96;
                    long j102 = (j75 * 654183) + j97;
                    long j103 = j98 - (j75 * 997805);
                    long j104 = (j75 * 136657) + (j93 - (j74 * 997805));
                    long j105 = j99 - (j75 * 683901);
                    long j106 = (j71 * 666643) + jM15940e;
                    long j107 = (j71 * 654183) + j101;
                    long j108 = (j71 * 136657) + j103;
                    long j109 = (j106 + 1048576) >> 21;
                    long j110 = (j71 * 470296) + j100 + j109;
                    long j111 = j106 - (j109 << 21);
                    long j112 = (j107 + 1048576) >> 21;
                    long j113 = (j102 - (j71 * 997805)) + j112;
                    long j114 = j107 - (j112 << 21);
                    long j115 = (j108 + 1048576) >> 21;
                    long j116 = (j104 - (j71 * 683901)) + j115;
                    long j117 = j108 - (j115 << 21);
                    long j118 = (j105 + 1048576) >> 21;
                    long j119 = (j94 - (j74 * 683901)) + j118;
                    long j120 = j105 - (j118 << 21);
                    long j121 = (j95 + 1048576) >> 21;
                    long j122 = j90 + j121;
                    long j123 = j95 - (j121 << 21);
                    long j124 = (j84 + 1048576) >> 21;
                    long j125 = j72 + j124;
                    long j126 = j84 - (j124 << 21);
                    long j127 = (j110 + 1048576) >> 21;
                    long j128 = j114 + j127;
                    long j129 = j110 - (j127 << 21);
                    long j130 = (j113 + 1048576) >> 21;
                    long j131 = j117 + j130;
                    long j132 = j113 - (j130 << 21);
                    long j133 = (j116 + 1048576) >> 21;
                    long j134 = j120 + j133;
                    long j135 = j116 - (j133 << 21);
                    long j136 = (j119 + 1048576) >> 21;
                    long j137 = j123 + j136;
                    long j138 = j119 - (j136 << 21);
                    long j139 = (j122 + 1048576) >> 21;
                    long j140 = (j125 + 1048576) >> 21;
                    long j141 = j125 - (j140 << 21);
                    long j142 = (j140 * 666643) + j111;
                    long j143 = (j140 * 470296) + j129;
                    long j144 = (j140 * 654183) + j128;
                    long j145 = j132 - (j140 * 997805);
                    long j146 = (j140 * 136657) + j131;
                    long j147 = j135 - (j140 * 683901);
                    long j148 = j142 >> 21;
                    long j149 = j143 + j148;
                    long j150 = j142 - (j148 << 21);
                    long j151 = j149 >> 21;
                    long j152 = j144 + j151;
                    long j153 = j149 - (j151 << 21);
                    long j154 = j152 >> 21;
                    long j155 = j145 + j154;
                    long j156 = j152 - (j154 << 21);
                    long j157 = j155 >> 21;
                    long j158 = j146 + j157;
                    long j159 = j155 - (j157 << 21);
                    long j160 = j158 >> 21;
                    long j161 = j147 + j160;
                    long j162 = j158 - (j160 << 21);
                    long j163 = j161 >> 21;
                    long j164 = j134 + j163;
                    long j165 = j161 - (j163 << 21);
                    long j166 = j164 >> 21;
                    long j167 = j138 + j166;
                    long j168 = j164 - (j166 << 21);
                    long j169 = j167 >> 21;
                    long j170 = j137 + j169;
                    long j171 = j167 - (j169 << 21);
                    long j172 = j170 >> 21;
                    long j173 = (j122 - (j139 << 21)) + j172;
                    long j174 = j170 - (j172 << 21);
                    long j175 = j173 >> 21;
                    long j176 = j126 + j139 + j175;
                    long j177 = j173 - (j175 << 21);
                    long j178 = j176 >> 21;
                    long j179 = j141 + j178;
                    long j180 = j176 - (j178 << 21);
                    long j181 = j179 >> 21;
                    long j182 = j179 - (j181 << 21);
                    long j183 = (666643 * j181) + j150;
                    long j184 = (654183 * j181) + j156;
                    long j185 = j159 - (997805 * j181);
                    long j186 = (136657 * j181) + j162;
                    long j187 = j165 - (j181 * 683901);
                    long j188 = j183 >> 21;
                    long j189 = (470296 * j181) + j153 + j188;
                    long j190 = j183 - (j188 << 21);
                    long j191 = j189 >> 21;
                    long j192 = j184 + j191;
                    long j193 = j189 - (j191 << 21);
                    long j194 = j192 >> 21;
                    long j195 = j185 + j194;
                    long j196 = j192 - (j194 << 21);
                    long j197 = j195 >> 21;
                    long j198 = j186 + j197;
                    long j199 = j195 - (j197 << 21);
                    long j200 = j198 >> 21;
                    long j201 = j187 + j200;
                    long j202 = j198 - (j200 << 21);
                    long j203 = j201 >> 21;
                    long j204 = j168 + j203;
                    long j205 = j201 - (j203 << 21);
                    long j206 = j204 >> 21;
                    long j207 = j171 + j206;
                    long j208 = j204 - (j206 << 21);
                    long j209 = j207 >> 21;
                    long j210 = j174 + j209;
                    long j211 = j207 - (j209 << 21);
                    long j212 = j210 >> 21;
                    long j213 = j177 + j212;
                    long j214 = j210 - (j212 << 21);
                    long j215 = j213 >> 21;
                    long j216 = j180 + j215;
                    long j217 = j213 - (j215 << 21);
                    long j218 = j216 >> 21;
                    long j219 = j182 + j218;
                    long j220 = j216 - (j218 << 21);
                    bArrDigest[0] = (byte) j190;
                    bArrDigest[1] = (byte) (j190 >> 8);
                    bArrDigest[2] = (byte) ((j190 >> 16) | (j193 << 5));
                    bArrDigest[3] = (byte) (j193 >> 3);
                    bArrDigest[4] = (byte) (j193 >> 11);
                    bArrDigest[5] = (byte) ((j193 >> 19) | (j196 << 2));
                    bArrDigest[6] = (byte) (j196 >> 6);
                    bArrDigest[7] = (byte) ((j196 >> 14) | (j199 << 7));
                    bArrDigest[8] = (byte) (j199 >> 1);
                    bArrDigest[9] = (byte) (j199 >> 9);
                    bArrDigest[10] = (byte) ((j199 >> 17) | (j202 << 4));
                    bArrDigest[11] = (byte) (j202 >> 4);
                    bArrDigest[12] = (byte) (j202 >> 12);
                    bArrDigest[13] = (byte) ((j202 >> 20) | (j205 << 1));
                    bArrDigest[14] = (byte) (j205 >> 7);
                    bArrDigest[15] = (byte) ((j205 >> 15) | (j208 << 6));
                    bArrDigest[16] = (byte) (j208 >> 2);
                    bArrDigest[17] = (byte) (j208 >> 10);
                    bArrDigest[18] = (byte) ((j208 >> 18) | (j211 << 3));
                    bArrDigest[19] = (byte) (j211 >> 5);
                    bArrDigest[20] = (byte) (j211 >> 13);
                    bArrDigest[21] = (byte) j214;
                    bArrDigest[22] = (byte) (j214 >> 8);
                    bArrDigest[23] = (byte) ((j214 >> 16) | (j217 << 5));
                    bArrDigest[24] = (byte) (j217 >> 3);
                    bArrDigest[25] = (byte) (j217 >> 11);
                    bArrDigest[26] = (byte) ((j217 >> 19) | (j220 << 2));
                    bArrDigest[27] = (byte) (j220 >> 6);
                    bArrDigest[28] = (byte) ((j220 >> 14) | (j219 << 7));
                    bArrDigest[29] = (byte) (j219 >> 1);
                    bArrDigest[30] = (byte) (j219 >> 9);
                    bArrDigest[31] = (byte) (j219 >> 17);
                    long[] jArr2 = new long[10];
                    long[] jArrM15939d = AbstractC14434c.m15939d(bArr5);
                    long[] jArr3 = new long[10];
                    jArr3[0] = 1;
                    long[] jArr4 = new long[10];
                    long[] jArr5 = new long[10];
                    long[] jArr6 = new long[10];
                    long[] jArr7 = new long[10];
                    long[] jArr8 = new long[10];
                    AbstractC14434c.m15946k(jArr5, jArrM15939d);
                    AbstractC14434c.m15942g(jArr6, jArr5, AbstractC14435d.f45404a);
                    AbstractC14434c.m15948m(jArr5, jArr5, jArr3);
                    AbstractC14434c.m15949n(jArr6, jArr6, jArr3);
                    long[] jArr9 = new long[10];
                    AbstractC14434c.m15946k(jArr9, jArr6);
                    AbstractC14434c.m15942g(jArr9, jArr9, jArr6);
                    AbstractC14434c.m15946k(jArr2, jArr9);
                    AbstractC14434c.m15942g(jArr2, jArr2, jArr6);
                    AbstractC14434c.m15942g(jArr2, jArr2, jArr5);
                    long[] jArr10 = new long[10];
                    long[] jArr11 = new long[10];
                    long[] jArr12 = new long[10];
                    AbstractC14434c.m15946k(jArr10, jArr2);
                    AbstractC14434c.m15946k(jArr11, jArr10);
                    AbstractC14434c.m15946k(jArr11, jArr11);
                    AbstractC14434c.m15942g(jArr11, jArr2, jArr11);
                    AbstractC14434c.m15942g(jArr10, jArr10, jArr11);
                    AbstractC14434c.m15946k(jArr10, jArr10);
                    AbstractC14434c.m15942g(jArr10, jArr11, jArr10);
                    AbstractC14434c.m15946k(jArr11, jArr10);
                    byte[] bArr6 = bArrCopyOfRange;
                    for (int i14 = 1; i14 < 5; i14++) {
                        AbstractC14434c.m15946k(jArr11, jArr11);
                    }
                    AbstractC14434c.m15942g(jArr10, jArr11, jArr10);
                    AbstractC14434c.m15946k(jArr11, jArr10);
                    for (int i15 = 1; i15 < 10; i15++) {
                        AbstractC14434c.m15946k(jArr11, jArr11);
                    }
                    AbstractC14434c.m15942g(jArr11, jArr11, jArr10);
                    AbstractC14434c.m15946k(jArr12, jArr11);
                    for (int i16 = 1; i16 < 20; i16++) {
                        AbstractC14434c.m15946k(jArr12, jArr12);
                    }
                    AbstractC14434c.m15942g(jArr11, jArr12, jArr11);
                    AbstractC14434c.m15946k(jArr11, jArr11);
                    for (int i17 = 1; i17 < 10; i17++) {
                        AbstractC14434c.m15946k(jArr11, jArr11);
                    }
                    AbstractC14434c.m15942g(jArr10, jArr11, jArr10);
                    AbstractC14434c.m15946k(jArr11, jArr10);
                    for (int i18 = 1; i18 < 50; i18++) {
                        AbstractC14434c.m15946k(jArr11, jArr11);
                    }
                    AbstractC14434c.m15942g(jArr11, jArr11, jArr10);
                    AbstractC14434c.m15946k(jArr12, jArr11);
                    for (int i19 = 1; i19 < 100; i19++) {
                        AbstractC14434c.m15946k(jArr12, jArr12);
                    }
                    AbstractC14434c.m15942g(jArr11, jArr12, jArr11);
                    AbstractC14434c.m15946k(jArr11, jArr11);
                    for (int i20 = 1; i20 < 50; i20++) {
                        AbstractC14434c.m15946k(jArr11, jArr11);
                    }
                    AbstractC14434c.m15942g(jArr10, jArr11, jArr10);
                    AbstractC14434c.m15946k(jArr10, jArr10);
                    AbstractC14434c.m15946k(jArr10, jArr10);
                    AbstractC14434c.m15942g(jArr2, jArr10, jArr2);
                    AbstractC14434c.m15942g(jArr2, jArr2, jArr9);
                    AbstractC14434c.m15942g(jArr2, jArr2, jArr5);
                    AbstractC14434c.m15946k(jArr7, jArr2);
                    AbstractC14434c.m15942g(jArr7, jArr7, jArr6);
                    AbstractC14434c.m15948m(jArr8, jArr7, jArr5);
                    if (AbstractC14434c.m15936a(jArr8)) {
                        AbstractC14434c.m15949n(jArr8, jArr7, jArr5);
                        if (AbstractC14434c.m15936a(jArr8)) {
                            throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                        }
                        AbstractC14434c.m15942g(jArr2, jArr2, AbstractC14435d.f45406c);
                    }
                    if (!AbstractC14434c.m15936a(jArr2) && ((bArr5[31] & 255) >> 7) != 0) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                    }
                    if ((AbstractC14434c.m15938c(jArr2)[0] & 1) == ((bArr5[31] & 255) >> 7)) {
                        for (int i21 = 0; i21 < 10; i21++) {
                            jArr2[i21] = -jArr2[i21];
                        }
                    }
                    AbstractC14434c.m15942g(jArr4, jArr2, jArrM15939d);
                    C14433b[] c14433bArr = new C14433b[8];
                    c14433bArr[0] = new C14433b(new C11234e(new C13711h(jArr2, jArrM15939d, jArr3, 21), 23, jArr4));
                    C13711h c13711h2 = new C13711h(21);
                    long[] jArr13 = new long[10];
                    C11241l c11241l = new C11241l(c13711h2, jArr13);
                    long[] jArr14 = new long[10];
                    long[] jArr15 = (long[]) c13711h2.f43259Z;
                    AbstractC14434c.m15946k(jArr15, jArr2);
                    long[] jArr16 = (long[]) c13711h2.f43261p0;
                    AbstractC14434c.m15946k(jArr16, jArrM15939d);
                    AbstractC14434c.m15946k(jArr13, jArr3);
                    AbstractC14434c.m15949n(jArr13, jArr13, jArr13);
                    long[] jArr17 = (long[]) c13711h2.f43260o0;
                    AbstractC14434c.m15949n(jArr17, jArr2, jArrM15939d);
                    AbstractC14434c.m15946k(jArr14, jArr17);
                    AbstractC14434c.m15949n(jArr17, jArr16, jArr15);
                    AbstractC14434c.m15948m(jArr16, jArr16, jArr15);
                    AbstractC14434c.m15948m(jArr15, jArr14, jArr17);
                    AbstractC14434c.m15948m(jArr13, jArr13, jArr16);
                    C11234e c11234e = new C11234e(c11241l);
                    for (int i22 = 1; i22 < 8; i22++) {
                        AbstractC14434c.m15937b(c11241l, c11234e, c14433bArr[i22 - 1]);
                        c14433bArr[i22] = new C14433b(new C11234e(c11241l));
                    }
                    byte[] bArrM15945j = AbstractC14434c.m15945j(bArrDigest);
                    byte[] bArrM15945j2 = AbstractC14434c.m15945j(bArr6);
                    C11241l c11241l2 = new C11241l(13);
                    C11234e c11234e2 = new C11234e(23);
                    int i23 = 255;
                    while (i23 >= 0 && bArrM15945j[i23] == 0 && bArrM15945j2[i23] == 0) {
                        i23--;
                    }
                    while (true) {
                        jArr = (long[]) c11241l2.f34017Z;
                        c13711h = (C13711h) c11241l2.f34016Y;
                        if (i23 < 0) {
                            break;
                        }
                        long[] jArr18 = new long[10];
                        long[] jArr19 = new long[10];
                        long[] jArr20 = new long[10];
                        AbstractC14434c.m15942g(jArr18, (long[]) c13711h.f43259Z, jArr);
                        long[] jArr21 = (long[]) c13711h.f43260o0;
                        long[] jArr22 = (long[]) c13711h.f43261p0;
                        AbstractC14434c.m15942g(jArr19, jArr21, jArr22);
                        AbstractC14434c.m15942g(jArr20, jArr22, jArr);
                        long[] jArr23 = new long[10];
                        long[] jArr24 = (long[]) c13711h.f43259Z;
                        AbstractC14434c.m15946k(jArr24, jArr18);
                        AbstractC14434c.m15946k(jArr22, jArr19);
                        AbstractC14434c.m15946k(jArr, jArr20);
                        AbstractC14434c.m15949n(jArr, jArr, jArr);
                        AbstractC14434c.m15949n(jArr21, jArr18, jArr19);
                        AbstractC14434c.m15946k(jArr23, jArr21);
                        AbstractC14434c.m15949n(jArr21, jArr22, jArr24);
                        AbstractC14434c.m15948m(jArr22, jArr22, jArr24);
                        AbstractC14434c.m15948m(jArr24, jArr23, jArr21);
                        AbstractC14434c.m15948m(jArr, jArr, jArr22);
                        byte b10 = bArrM15945j[i23];
                        if (b10 > 0) {
                            C11234e.m12496v(c11234e2, c11241l2);
                            b = 2;
                            AbstractC14434c.m15937b(c11241l2, c11234e2, c14433bArr[bArrM15945j[i23] / 2]);
                        } else {
                            b = 2;
                            if (b10 < 0) {
                                C11234e.m12496v(c11234e2, c11241l2);
                                AbstractC14434c.m15947l(c11241l2, c11234e2, c14433bArr[(-bArrM15945j[i23]) / 2]);
                            }
                        }
                        byte b11 = bArrM15945j2[i23];
                        if (b11 > 0) {
                            C11234e.m12496v(c11234e2, c11241l2);
                            AbstractC14434c.m15937b(c11241l2, c11234e2, AbstractC14435d.f45408e[bArrM15945j2[i23] / b]);
                        } else if (b11 < 0) {
                            C11234e.m12496v(c11234e2, c11241l2);
                            AbstractC14434c.m15947l(c11241l2, c11234e2, AbstractC14435d.f45408e[(-bArrM15945j2[i23]) / b]);
                        }
                        i23--;
                    }
                    long[] jArr25 = new long[10];
                    long[] jArr26 = new long[10];
                    long[] jArr27 = new long[10];
                    AbstractC14434c.m15942g(jArr25, (long[]) c13711h.f43259Z, jArr);
                    long[] jArr28 = (long[]) c13711h.f43260o0;
                    long[] jArr29 = (long[]) c13711h.f43261p0;
                    AbstractC14434c.m15942g(jArr26, jArr28, jArr29);
                    AbstractC14434c.m15942g(jArr27, jArr29, jArr);
                    long[] jArr30 = new long[10];
                    long[] jArr31 = new long[10];
                    long[] jArr32 = new long[10];
                    long[] jArr33 = new long[10];
                    long[] jArr34 = new long[10];
                    long[] jArr35 = new long[10];
                    long[] jArr36 = new long[10];
                    long[] jArr37 = new long[10];
                    long[] jArr38 = new long[10];
                    long[] jArr39 = new long[10];
                    long[] jArr40 = new long[10];
                    long[] jArr41 = new long[10];
                    long[] jArr42 = new long[10];
                    AbstractC14434c.m15946k(jArr33, jArr27);
                    AbstractC14434c.m15946k(jArr42, jArr33);
                    AbstractC14434c.m15946k(jArr41, jArr42);
                    AbstractC14434c.m15942g(jArr34, jArr41, jArr27);
                    AbstractC14434c.m15942g(jArr35, jArr34, jArr33);
                    AbstractC14434c.m15946k(jArr41, jArr35);
                    AbstractC14434c.m15942g(jArr36, jArr41, jArr34);
                    AbstractC14434c.m15946k(jArr41, jArr36);
                    AbstractC14434c.m15946k(jArr42, jArr41);
                    AbstractC14434c.m15946k(jArr41, jArr42);
                    AbstractC14434c.m15946k(jArr42, jArr41);
                    AbstractC14434c.m15946k(jArr41, jArr42);
                    AbstractC14434c.m15942g(jArr37, jArr41, jArr36);
                    AbstractC14434c.m15946k(jArr41, jArr37);
                    AbstractC14434c.m15946k(jArr42, jArr41);
                    int i24 = 2;
                    for (int i25 = 10; i24 < i25; i25 = 10) {
                        AbstractC14434c.m15946k(jArr41, jArr42);
                        AbstractC14434c.m15946k(jArr42, jArr41);
                        i24 += 2;
                    }
                    AbstractC14434c.m15942g(jArr38, jArr42, jArr37);
                    AbstractC14434c.m15946k(jArr41, jArr38);
                    AbstractC14434c.m15946k(jArr42, jArr41);
                    for (int i26 = 2; i26 < 20; i26 += 2) {
                        AbstractC14434c.m15946k(jArr41, jArr42);
                        AbstractC14434c.m15946k(jArr42, jArr41);
                    }
                    AbstractC14434c.m15942g(jArr41, jArr42, jArr38);
                    AbstractC14434c.m15946k(jArr42, jArr41);
                    AbstractC14434c.m15946k(jArr41, jArr42);
                    for (int i27 = 2; i27 < 10; i27 += 2) {
                        AbstractC14434c.m15946k(jArr42, jArr41);
                        AbstractC14434c.m15946k(jArr41, jArr42);
                    }
                    AbstractC14434c.m15942g(jArr39, jArr41, jArr37);
                    AbstractC14434c.m15946k(jArr41, jArr39);
                    AbstractC14434c.m15946k(jArr42, jArr41);
                    int i28 = 2;
                    for (int i29 = 50; i28 < i29; i29 = 50) {
                        AbstractC14434c.m15946k(jArr41, jArr42);
                        AbstractC14434c.m15946k(jArr42, jArr41);
                        i28 += 2;
                    }
                    AbstractC14434c.m15942g(jArr40, jArr42, jArr39);
                    AbstractC14434c.m15946k(jArr42, jArr40);
                    AbstractC14434c.m15946k(jArr41, jArr42);
                    for (int i30 = 2; i30 < 100; i30 += 2) {
                        AbstractC14434c.m15946k(jArr42, jArr41);
                        AbstractC14434c.m15946k(jArr41, jArr42);
                    }
                    AbstractC14434c.m15942g(jArr42, jArr41, jArr40);
                    AbstractC14434c.m15946k(jArr41, jArr42);
                    AbstractC14434c.m15946k(jArr42, jArr41);
                    for (int i31 = 2; i31 < 50; i31 += 2) {
                        AbstractC14434c.m15946k(jArr41, jArr42);
                        AbstractC14434c.m15946k(jArr42, jArr41);
                    }
                    AbstractC14434c.m15942g(jArr41, jArr42, jArr39);
                    AbstractC14434c.m15946k(jArr42, jArr41);
                    AbstractC14434c.m15946k(jArr41, jArr42);
                    AbstractC14434c.m15946k(jArr42, jArr41);
                    AbstractC14434c.m15946k(jArr41, jArr42);
                    AbstractC14434c.m15946k(jArr42, jArr41);
                    AbstractC14434c.m15942g(jArr30, jArr42, jArr35);
                    AbstractC14434c.m15942g(jArr31, jArr25, jArr30);
                    AbstractC14434c.m15942g(jArr32, jArr26, jArr30);
                    byte[] bArrM15938c = AbstractC14434c.m15938c(jArr32);
                    bArrM15938c[31] = (byte) (bArrM15938c[31] ^ ((AbstractC14434c.m15938c(jArr31)[0] & 1) << 7));
                    for (int i32 = 0; i32 < 32; i32++) {
                        if (bArrM15938c[i32] != bArr[i32]) {
                            break;
                        }
                    }
                    return;
                }
                i11--;
                bArr3 = bArr;
                bArrCopyOfRange = bArrCopyOfRange;
                i10 = i10;
            }
        }
        throw new GeneralSecurityException("Signature check failed.");
    }
}
