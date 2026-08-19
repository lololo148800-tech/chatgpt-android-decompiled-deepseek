package co;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import ao.AbstractC11154b;
import ao.C11196w;
import bo.AbstractC11516d;
import bo.AbstractC11523k;
import bo.C11521i;
import bo.InterfaceC11522j;
import com.google.android.datatransport.cct.NwaZ.lZYtIbClQJm;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.AbstractC16643b;
import kotlinx.serialization.json.C16644c;
import p001A.C0042V0;
import p003A1.C0295v;
import p013Ab.C0420b;
import p1113xn.AbstractC21322p;
import p207I4.C3614a;
import p277L.AbstractC4835h;
import p372P3.AbstractC6327i;
import p509Uk.lpqL.SfpOlmlMATQ;
import p559Wn.C8970b;
import p559Wn.C8976h;
import p594Y9.AbstractC9810T3;
import p606Yn.C10109j;
import p631Zn.InterfaceC10428a;
import p658b5.p659zh.MMVKXkcLpuHFDi;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17686t;

/* JADX INFO: renamed from: co.E */
/* JADX INFO: loaded from: classes2.dex */
public final class C11804E extends AbstractC4835h implements InterfaceC11522j {

    /* JADX INFO: renamed from: b */
    public final AbstractC11516d f35777b;

    /* JADX INFO: renamed from: c */
    public final EnumC11810K f35778c;

    /* JADX INFO: renamed from: d */
    public final AbstractC6327i f35779d;

    /* JADX INFO: renamed from: e */
    public final C0042V0 f35780e;

    /* JADX INFO: renamed from: f */
    public int f35781f;

    /* JADX INFO: renamed from: g */
    public C3614a f35782g;

    /* JADX INFO: renamed from: h */
    public final C11521i f35783h;

    /* JADX INFO: renamed from: i */
    public final C11824n f35784i;

    public C11804E(AbstractC11516d json, EnumC11810K enumC11810K, AbstractC6327i abstractC6327i, SerialDescriptor descriptor, C3614a c3614a) {
        AbstractC16544l.m18094g(json, "json");
        AbstractC16544l.m18094g(descriptor, "descriptor");
        this.f35777b = json;
        this.f35778c = enumC11810K;
        this.f35779d = abstractC6327i;
        this.f35780e = json.f34844b;
        this.f35781f = -1;
        this.f35782g = c3614a;
        C11521i c11521i = json.f34843a;
        this.f35783h = c11521i;
        this.f35784i = c11521i.f34874f ? null : new C11824n(descriptor);
    }

    @Override // p277L.AbstractC4835h, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: A */
    public final byte mo5463A() {
        AbstractC6327i abstractC6327i = this.f35779d;
        long jM6925i = abstractC6327i.m6925i();
        byte b = (byte) jM6925i;
        if (jM6925i == b) {
            return b;
        }
        AbstractC6327i.m6908r(abstractC6327i, "Failed to parse byte for input '" + jM6925i + '\'', 0, null, 6);
        throw null;
    }

    @Override // p277L.AbstractC4835h, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: B */
    public final short mo5464B() {
        AbstractC6327i abstractC6327i = this.f35779d;
        long jM6925i = abstractC6327i.m6925i();
        short s10 = (short) jM6925i;
        if (jM6925i == s10) {
            return s10;
        }
        AbstractC6327i.m6908r(abstractC6327i, "Failed to parse short for input '" + jM6925i + '\'', 0, null, 6);
        throw null;
    }

    @Override // p277L.AbstractC4835h, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: C */
    public final float mo5465C() {
        AbstractC6327i abstractC6327i = this.f35779d;
        String strM6928l = abstractC6327i.m6928l();
        try {
            float f10 = Float.parseFloat(strM6928l);
            if (this.f35777b.f34843a.f34879k || !(Float.isInfinite(f10) || Float.isNaN(f10))) {
                return f10;
            }
            AbstractC11828r.m13117w(abstractC6327i, Float.valueOf(f10));
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC6327i.m6908r(abstractC6327i, AbstractC10763a.m11047e('\'', "Failed to parse type 'float' for input '", strM6928l), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder, p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: a */
    public final C0042V0 mo10913a() {
        return this.f35780e;
    }

    @Override // p277L.AbstractC4835h, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: c */
    public final InterfaceC10428a mo5471c(SerialDescriptor descriptor) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        AbstractC11516d abstractC11516d = this.f35777b;
        EnumC11810K enumC11810KM13116v = AbstractC11828r.m13116v(abstractC11516d, descriptor);
        AbstractC6327i abstractC6327i = this.f35779d;
        C0420b c0420b = (C0420b) abstractC6327i.f20529c;
        int i10 = c0420b.f1381Z + 1;
        c0420b.f1381Z = i10;
        Object[] objArr = (Object[]) c0420b.f1382o0;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i11);
            AbstractC16544l.m18093f(objArrCopyOf, "copyOf(...)");
            c0420b.f1382o0 = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf((int[]) c0420b.f1383p0, i11);
            AbstractC16544l.m18093f(iArrCopyOf, "copyOf(...)");
            c0420b.f1383p0 = iArrCopyOf;
        }
        ((Object[]) c0420b.f1382o0)[i10] = descriptor;
        abstractC6327i.mo6924h(enumC11810KM13116v.f35804Y);
        if (abstractC6327i.mo6939y() == 4) {
            AbstractC6327i.m6908r(abstractC6327i, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int iOrdinal = enumC11810KM13116v.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return new C11804E(this.f35777b, enumC11810KM13116v, abstractC6327i, descriptor, this.f35782g);
        }
        if (this.f35778c == enumC11810KM13116v && abstractC11516d.f34843a.f34874f) {
            return this;
        }
        return new C11804E(this.f35777b, enumC11810KM13116v, abstractC6327i, descriptor, this.f35782g);
    }

    @Override // bo.InterfaceC11522j
    /* JADX INFO: renamed from: d */
    public final AbstractC11516d mo12906d() {
        return this.f35777b;
    }

    @Override // p277L.AbstractC4835h, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: e */
    public final boolean mo5472e() {
        boolean z6;
        boolean z10;
        AbstractC6327i abstractC6327i = this.f35779d;
        int iMo6912D = abstractC6327i.mo6912D();
        if (iMo6912D == abstractC6327i.mo6936u().length()) {
            AbstractC6327i.m6908r(abstractC6327i, "EOF", 0, null, 6);
            throw null;
        }
        if (abstractC6327i.mo6936u().charAt(iMo6912D) == '\"') {
            iMo6912D++;
            z6 = true;
        } else {
            z6 = false;
        }
        int iMo6910A = abstractC6327i.mo6910A(iMo6912D);
        if (iMo6910A >= abstractC6327i.mo6936u().length() || iMo6910A == -1) {
            AbstractC6327i.m6908r(abstractC6327i, "EOF", 0, null, 6);
            throw null;
        }
        int i10 = iMo6910A + 1;
        int iCharAt = abstractC6327i.mo6936u().charAt(iMo6910A) | ' ';
        if (iCharAt == 102) {
            abstractC6327i.m6920d(i10, "alse");
            z10 = false;
        } else {
            if (iCharAt != 116) {
                AbstractC6327i.m6908r(abstractC6327i, "Expected valid boolean literal prefix, but had '" + abstractC6327i.m6928l() + '\'', 0, null, 6);
                throw null;
            }
            abstractC6327i.m6920d(i10, "rue");
            z10 = true;
        }
        if (z6) {
            if (abstractC6327i.f20528b == abstractC6327i.mo6936u().length()) {
                AbstractC6327i.m6908r(abstractC6327i, "EOF", 0, null, 6);
                throw null;
            }
            if (abstractC6327i.mo6936u().charAt(abstractC6327i.f20528b) != '\"') {
                AbstractC6327i.m6908r(abstractC6327i, "Expected closing quotation mark", 0, null, 6);
                throw null;
            }
            abstractC6327i.f20528b++;
        }
        return z10;
    }

    @Override // p277L.AbstractC4835h, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: f */
    public final char mo5473f() {
        AbstractC6327i abstractC6327i = this.f35779d;
        String strM6928l = abstractC6327i.m6928l();
        if (strM6928l.length() == 1) {
            return strM6928l.charAt(0);
        }
        AbstractC6327i.m6908r(abstractC6327i, AbstractC10763a.m11047e('\'', "Expected single char, but got '", strM6928l), 0, null, 6);
        throw null;
    }

    @Override // p277L.AbstractC4835h, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: h */
    public final int mo5475h(SerialDescriptor enumDescriptor) {
        AbstractC16544l.m18094g(enumDescriptor, "enumDescriptor");
        return AbstractC11828r.m13110p(enumDescriptor, this.f35777b, mo5479m(), " at path ".concat(((C0420b) this.f35779d.f20529c).m1066v()));
    }

    @Override // bo.InterfaceC11522j
    /* JADX INFO: renamed from: j */
    public final AbstractC16643b mo12907j() {
        return new C11801B(this.f35777b.f34843a, this.f35779d).m13065c();
    }

    @Override // p277L.AbstractC4835h, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: k */
    public final int mo5477k() {
        AbstractC6327i abstractC6327i = this.f35779d;
        long jM6925i = abstractC6327i.m6925i();
        int i10 = (int) jM6925i;
        if (jM6925i == i10) {
            return i10;
        }
        AbstractC6327i.m6908r(abstractC6327i, "Failed to parse int for input '" + jM6925i + '\'', 0, null, 6);
        throw null;
    }

    @Override // p277L.AbstractC4835h, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: m */
    public final String mo5479m() {
        boolean z6 = this.f35783h.f34871c;
        AbstractC6327i abstractC6327i = this.f35779d;
        return z6 ? abstractC6327i.m6929m() : abstractC6327i.m6926j();
    }

    @Override // p277L.AbstractC4835h, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: n */
    public final long mo5480n() {
        return this.f35779d.m6925i();
    }

    @Override // p277L.AbstractC4835h, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: r */
    public final boolean mo5484r() {
        C11824n c11824n = this.f35784i;
        return ((c11824n != null ? c11824n.f35834b : false) || this.f35779d.m6915G(true)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:176:0x02ba A[EDGE_INSN: B:176:0x02ba->B:177:0x02bb BREAK  A[LOOP:2: B:159:0x0258->B:207:?]] */
    /* JADX WARN: Code duplicated, block: B:198:0x022d A[EDGE_INSN: B:198:0x022d->B:147:0x022d BREAK  A[LOOP:1: B:114:0x0198->B:200:0x0198], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: s */
    public final int mo10914s(SerialDescriptor descriptor) {
        boolean zM6914F;
        boolean z6;
        boolean z10;
        boolean z11;
        char c9;
        String strM6940z;
        AbstractC16544l.m18094g(descriptor, "descriptor");
        EnumC11810K enumC11810K = this.f35778c;
        int iOrdinal = enumC11810K.ordinal();
        AbstractC6327i abstractC6327i = this.f35779d;
        boolean z12 = true;
        boolean zM6914F2 = false;
        char c10 = ':';
        AbstractC11516d abstractC11516d = this.f35777b;
        int i10 = -1;
        C0420b c0420b = (C0420b) abstractC6327i.f20529c;
        if (iOrdinal == 0) {
            boolean zM6914F3 = abstractC6327i.m6914F();
            while (true) {
                boolean zMo6919c = abstractC6327i.mo6919c();
                C11824n c11824n = this.f35784i;
                if (zMo6919c) {
                    C11521i c11521i = this.f35783h;
                    boolean z13 = c11521i.f34871c;
                    String strM6929m = z13 ? abstractC6327i.m6929m() : abstractC6327i.mo6921e();
                    abstractC6327i.mo6924h(c10);
                    int iM13109o = AbstractC11828r.m13109o(descriptor, abstractC11516d, strM6929m);
                    if (iM13109o != -3) {
                        if (c11521i.f34876h) {
                            boolean zMo10686i = descriptor.mo10686i(iM13109o);
                            SerialDescriptor serialDescriptorMo10685h = descriptor.mo10685h(iM13109o);
                            if (!zMo10686i || serialDescriptorMo10685h.mo10680c() || !abstractC6327i.m6915G(z12)) {
                                if (AbstractC16544l.m18089b(serialDescriptorMo10685h.getKind(), C10109j.f29934b) && ((!serialDescriptorMo10685h.mo10680c() || !abstractC6327i.m6915G(false)) && (strM6940z = abstractC6327i.m6940z(z13)) != null)) {
                                    int iM13109o2 = AbstractC11828r.m13109o(serialDescriptorMo10685h, abstractC11516d, strM6940z);
                                    boolean z14 = !abstractC11516d.f34843a.f34874f && serialDescriptorMo10685h.mo10680c();
                                    if (iM13109o2 == -3 && (zMo10686i || z14)) {
                                        abstractC6327i.m6926j();
                                    }
                                }
                            }
                            zM6914F = abstractC6327i.m6914F();
                            z6 = false;
                        }
                        if (c11824n != null) {
                            C11196w c11196w = c11824n.f35833a;
                            if (iM13109o < 64) {
                                c11196w.f33856c |= 1 << iM13109o;
                            } else {
                                int i11 = (iM13109o >>> 6) - 1;
                                long[] jArr = c11196w.f33857d;
                                jArr[i11] = jArr[i11] | (1 << (iM13109o & 63));
                            }
                        }
                        i10 = iM13109o;
                    } else {
                        zM6914F = false;
                        z6 = true;
                    }
                    if (z6) {
                        if (!c11521i.f34870b) {
                            C3614a c3614a = this.f35782g;
                            if (c3614a == null || !AbstractC16544l.m18089b(c3614a.f11031Y, strM6929m)) {
                                abstractC6327i.m6933q(AbstractC21322p.m21684R(abstractC6327i.mo6913E(0, abstractC6327i.f20528b), 0, 6, strM6929m), AbstractC10763a.m11047e('\'', "Encountered an unknown key '", strM6929m), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                                throw null;
                            }
                            c3614a.f11031Y = null;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte bMo6939y = abstractC6327i.mo6939y();
                        if (bMo6939y == 8 || bMo6939y == 6) {
                            while (true) {
                                byte bMo6939y2 = abstractC6327i.mo6939y();
                                z10 = true;
                                if (bMo6939y2 != 1) {
                                    if (bMo6939y2 != 8) {
                                        if (bMo6939y2 == 6) {
                                            c9 = 6;
                                            z11 = false;
                                        } else {
                                            if (bMo6939y2 == 9) {
                                                if (((Number) AbstractC17680n.m19351a0(arrayList)).byteValue() != 8) {
                                                    throw AbstractC11828r.m13097c(abstractC6327i.f20528b, abstractC6327i.mo6936u(), "found ] instead of } at path: " + c0420b);
                                                }
                                                AbstractC17686t.m19397E(arrayList);
                                            } else if (bMo6939y2 == 7) {
                                                if (((Number) AbstractC17680n.m19351a0(arrayList)).byteValue() != 6) {
                                                    throw AbstractC11828r.m13097c(abstractC6327i.f20528b, abstractC6327i.mo6936u(), "found } instead of ] at path: " + c0420b);
                                                }
                                                AbstractC17686t.m19397E(arrayList);
                                            } else if (bMo6939y2 == 10) {
                                                AbstractC6327i.m6908r(abstractC6327i, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                                throw null;
                                            }
                                            z11 = false;
                                            c9 = 6;
                                        }
                                        abstractC6327i.mo6922f();
                                        if (arrayList.size() == 0) {
                                            break;
                                        }
                                    } else {
                                        z11 = false;
                                        c9 = 6;
                                    }
                                    arrayList.add(Byte.valueOf(bMo6939y2));
                                    abstractC6327i.mo6922f();
                                    if (arrayList.size() == 0) {
                                        break;
                                        break;
                                    }
                                } else if (z13) {
                                    abstractC6327i.m6928l();
                                } else {
                                    abstractC6327i.mo6921e();
                                }
                            }
                        } else {
                            abstractC6327i.m6928l();
                            z10 = true;
                            z11 = false;
                            c9 = 6;
                        }
                        zM6914F3 = abstractC6327i.m6914F();
                        z12 = z10;
                        zM6914F2 = z11;
                    } else {
                        zM6914F3 = zM6914F;
                        z12 = true;
                        zM6914F2 = false;
                    }
                    c10 = ':';
                } else {
                    ?? r10 = zM6914F2;
                    if (zM6914F3 && !abstractC11516d.f34843a.f34883o) {
                        AbstractC11828r.m13112r(abstractC6327i, "object");
                        throw null;
                    }
                    if (c11824n == null) {
                        i10 = -1;
                        break;
                    }
                    C11196w c11196w2 = c11824n.f35833a;
                    SerialDescriptor serialDescriptor = c11196w2.f33854a;
                    int iMo10682e = serialDescriptor.mo10682e();
                    while (true) {
                        long j10 = c11196w2.f33856c;
                        long j11 = -1;
                        C0295v c0295v = c11196w2.f33855b;
                        if (j10 == -1) {
                            if (iMo10682e <= 64) {
                                i10 = -1;
                                break;
                            }
                            long[] jArr2 = c11196w2.f33857d;
                            int length = jArr2.length;
                            loop3: while (true) {
                                if (r10 >= length) {
                                    i10 = -1;
                                    break;
                                }
                                int i12 = r10 + 1;
                                int i13 = i12 * 64;
                                long j12 = jArr2[r10];
                                while (true) {
                                    if (j12 != j11) {
                                        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j12);
                                        j12 |= 1 << iNumberOfTrailingZeros;
                                        int i14 = iNumberOfTrailingZeros + i13;
                                        if (((Boolean) c0295v.invoke(serialDescriptor, Integer.valueOf(i14))).booleanValue()) {
                                            jArr2[r10] = j12;
                                            i10 = i14;
                                            break;
                                        }
                                        j11 = -1;
                                    } else {
                                        jArr2[r10] = j12;
                                        r10 = i12;
                                        j11 = -1;
                                    }
                                }
                            }
                        } else {
                            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j10);
                            c11196w2.f33856c |= 1 << iNumberOfTrailingZeros2;
                            if (((Boolean) c0295v.invoke(serialDescriptor, Integer.valueOf(iNumberOfTrailingZeros2))).booleanValue()) {
                                i10 = iNumberOfTrailingZeros2;
                                break;
                            }
                        }
                    }
                }
            }
        } else if (iOrdinal != 2) {
            boolean zM6914F4 = abstractC6327i.m6914F();
            if (abstractC6327i.mo6919c()) {
                int i15 = this.f35781f;
                if (i15 != -1 && !zM6914F4) {
                    AbstractC6327i.m6908r(abstractC6327i, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i10 = i15 + 1;
                this.f35781f = i10;
            } else if (zM6914F4 && !abstractC11516d.f34843a.f34883o) {
                AbstractC11828r.m13112r(abstractC6327i, "array");
                throw null;
            }
        } else {
            int i16 = this.f35781f;
            boolean z15 = i16 % 2 != 0;
            if (!z15) {
                abstractC6327i.mo6924h(':');
            } else if (i16 != -1) {
                zM6914F2 = abstractC6327i.m6914F();
            }
            if (abstractC6327i.mo6919c()) {
                if (z15) {
                    if (this.f35781f == -1) {
                        int i17 = abstractC6327i.f20528b;
                        if (zM6914F2) {
                            AbstractC6327i.m6908r(abstractC6327i, "Unexpected leading comma", i17, null, 4);
                            throw null;
                        }
                    } else {
                        int i18 = abstractC6327i.f20528b;
                        if (!zM6914F2) {
                            AbstractC6327i.m6908r(abstractC6327i, "Expected comma after the key-value pair", i18, null, 4);
                            throw null;
                        }
                    }
                }
                i10 = this.f35781f + 1;
                this.f35781f = i10;
            } else if (zM6914F2 && !abstractC11516d.f34843a.f34883o) {
                AbstractC11828r.m13112r(abstractC6327i, "object");
                throw null;
            }
        }
        if (enumC11810K != EnumC11810K.MAP) {
            ((int[]) c0420b.f1383p0)[c0420b.f1381Z] = i10;
        }
        return i10;
    }

    @Override // p277L.AbstractC4835h, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: v */
    public final Decoder mo5487v(SerialDescriptor descriptor) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        return AbstractC11806G.m13070a(descriptor) ? new C11822l(this.f35779d, this.f35777b) : this;
    }

    @Override // p277L.AbstractC4835h, p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: y */
    public final Object mo5490y(SerialDescriptor descriptor, int i10, KSerializer deserializer, Object obj) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        AbstractC16544l.m18094g(deserializer, "deserializer");
        boolean z6 = this.f35778c == EnumC11810K.MAP && (i10 & 1) == 0;
        C0420b c0420b = (C0420b) this.f35779d.f20529c;
        if (z6) {
            int[] iArr = (int[]) c0420b.f1383p0;
            int i11 = c0420b.f1381Z;
            if (iArr[i11] == -2) {
                ((Object[]) c0420b.f1382o0)[i11] = C11829s.f35845a;
            }
        }
        Object objMo5490y = super.mo5490y(descriptor, i10, deserializer, obj);
        if (z6) {
            int[] iArr2 = (int[]) c0420b.f1383p0;
            int i12 = c0420b.f1381Z;
            if (iArr2[i12] != -2) {
                int i13 = i12 + 1;
                c0420b.f1381Z = i13;
                Object[] objArr = (Object[]) c0420b.f1382o0;
                if (i13 == objArr.length) {
                    int i14 = i13 * 2;
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, i14);
                    AbstractC16544l.m18093f(objArrCopyOf, "copyOf(...)");
                    c0420b.f1382o0 = objArrCopyOf;
                    int[] iArrCopyOf = Arrays.copyOf((int[]) c0420b.f1383p0, i14);
                    AbstractC16544l.m18093f(iArrCopyOf, "copyOf(...)");
                    c0420b.f1383p0 = iArrCopyOf;
                }
            }
            Object[] objArr2 = (Object[]) c0420b.f1382o0;
            int i15 = c0420b.f1381Z;
            objArr2[i15] = objMo5490y;
            ((int[]) c0420b.f1383p0)[i15] = -2;
        }
        return objMo5490y;
    }

    @Override // p277L.AbstractC4835h, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: F */
    public final double mo5468F() {
        AbstractC6327i abstractC6327i = this.f35779d;
        String strM6928l = abstractC6327i.m6928l();
        try {
            double d10 = Double.parseDouble(strM6928l);
            if (this.f35777b.f34843a.f34879k || !(Double.isInfinite(d10) || Double.isNaN(d10))) {
                return d10;
            }
            AbstractC11828r.m13117w(abstractC6327i, Double.valueOf(d10));
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC6327i.m6908r(abstractC6327i, AbstractC10763a.m11047e('\'', MMVKXkcLpuHFDi.nCXWIimMjRwm, strM6928l), 0, null, 6);
            throw null;
        }
    }

    @Override // p277L.AbstractC4835h, p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: b */
    public final void mo5470b(SerialDescriptor serialDescriptor) {
        AbstractC16544l.m18094g(serialDescriptor, SfpOlmlMATQ.iaNQuSNaTuysms);
        AbstractC11516d abstractC11516d = this.f35777b;
        if (abstractC11516d.f34843a.f34870b && serialDescriptor.mo10682e() == 0) {
            while (mo10914s(serialDescriptor) != -1) {
            }
        }
        AbstractC6327i abstractC6327i = this.f35779d;
        if (abstractC6327i.m6914F() && !abstractC11516d.f34843a.f34883o) {
            AbstractC11828r.m13112r(abstractC6327i, "");
            throw null;
        }
        abstractC6327i.mo6924h(this.f35778c.f35805Z);
        C0420b c0420b = (C0420b) abstractC6327i.f20529c;
        int i10 = c0420b.f1381Z;
        int[] iArr = (int[]) c0420b.f1383p0;
        if (iArr[i10] == -2) {
            iArr[i10] = -1;
            c0420b.f1381Z = i10 - 1;
        }
        int i11 = c0420b.f1381Z;
        if (i11 != -1) {
            c0420b.f1381Z = i11 - 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x012c  */
    /* JADX WARN: Code duplicated, block: B:43:0x012d  */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x012d, please report this as an issue */
    @Override // p277L.AbstractC4835h, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: p */
    public final Object mo5482p(KSerializer deserializer) {
        String message;
        AbstractC11516d abstractC11516d = this.f35777b;
        AbstractC6327i abstractC6327i = this.f35779d;
        C0420b c0420b = (C0420b) abstractC6327i.f20529c;
        AbstractC16544l.m18094g(deserializer, "deserializer");
        try {
            if ((deserializer instanceof AbstractC11154b) && !abstractC11516d.f34843a.f34877i) {
                String strM13105k = AbstractC11828r.m13105k(abstractC11516d, ((AbstractC11154b) deserializer).getDescriptor());
                String strMo6938x = abstractC6327i.mo6938x(strM13105k, this.f35783h.f34871c);
                if (strMo6938x != null) {
                    try {
                        KSerializer kSerializerM10437a = AbstractC9810T3.m10437a((AbstractC11154b) deserializer, this, strMo6938x);
                        C3614a c3614a = new C3614a();
                        c3614a.f11031Y = strM13105k;
                        this.f35782g = c3614a;
                        return kSerializerM10437a.deserialize(this);
                    } catch (C8976h e10) {
                        String message2 = e10.getMessage();
                        AbstractC16544l.m18091d(message2);
                        String strM21690X = AbstractC21322p.m21690X(AbstractC21322p.m21705m0(message2, '\n'), lZYtIbClQJm.qOD);
                        String message3 = e10.getMessage();
                        AbstractC16544l.m18091d(message3);
                        AbstractC6327i.m6908r(abstractC6327i, strM21690X, 0, AbstractC21322p.m21701i0('\n', message3, ""), 2);
                        throw null;
                    }
                }
                if ((deserializer instanceof AbstractC11154b) && !abstractC11516d.f34843a.f34877i) {
                    String strM13105k2 = AbstractC11828r.m13105k(abstractC11516d, ((AbstractC11154b) deserializer).getDescriptor());
                    AbstractC16643b abstractC16643bMo12907j = mo12907j();
                    String strMo10679a = ((AbstractC11154b) deserializer).getDescriptor().mo10679a();
                    if (abstractC16643bMo12907j instanceof C16644c) {
                        C16644c c16644c = (C16644c) abstractC16643bMo12907j;
                        AbstractC16643b abstractC16643b = (AbstractC16643b) c16644c.get(strM13105k2);
                        try {
                            return AbstractC11828r.m13115u(abstractC11516d, strM13105k2, c16644c, AbstractC9810T3.m10437a((AbstractC11154b) deserializer, this, abstractC16643b != null ? AbstractC11523k.m12913f(AbstractC11523k.m12918k(abstractC16643b)) : null));
                        } catch (C8976h e11) {
                            String message4 = e11.getMessage();
                            AbstractC16544l.m18091d(message4);
                            throw AbstractC11828r.m13097c(-1, c16644c.toString(), message4);
                        }
                    }
                    StringBuilder sb2 = new StringBuilder("Expected ");
                    C16527D c16527d = AbstractC16526C.f51263a;
                    sb2.append(c16527d.mo5693b(C16644c.class).mo4448c());
                    sb2.append(", but had ");
                    sb2.append(c16527d.mo5693b(abstractC16643bMo12907j.getClass()).mo4448c());
                    sb2.append(" as the serialized body of ");
                    sb2.append(strMo10679a);
                    sb2.append(" at element: ");
                    sb2.append(c0420b.m1066v());
                    throw AbstractC11828r.m13097c(-1, abstractC16643bMo12907j.toString(), sb2.toString());
                }
                return deserializer.deserialize(this);
                message = e.getMessage();
                AbstractC16544l.m18091d(message);
                if (AbstractC21322p.m21667A(message, "at path", false)) {
                    throw e;
                }
                throw new C8970b(e.f27405Y, e.getMessage() + " at path: " + c0420b.m1066v(), e);
            }
            return deserializer.deserialize(this);
        } catch (C8970b e12) {
            message = e12.getMessage();
            AbstractC16544l.m18091d(message);
            if (AbstractC21322p.m21667A(message, "at path", false)) {
                throw e12;
            }
            throw new C8970b(e12.f27405Y, e12.getMessage() + " at path: " + c0420b.m1066v(), e12);
        }
    }
}
