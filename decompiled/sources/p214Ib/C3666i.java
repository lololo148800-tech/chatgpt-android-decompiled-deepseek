package p214Ib;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicIntegerArray;
import p001A.AbstractC0010F;
import p228J.AbstractC3794B0;
import p265Kb.AbstractC4620m;
import p265Kb.C4617j;
import p265Kb.C4618k;
import p265Kb.C4619l;
import p265Kb.C4621n;
import p288Lb.C4975h;
import p379Pb.C6381b;
import p379Pb.C6382c;

/* JADX INFO: renamed from: Ib.i */
/* JADX INFO: loaded from: classes.dex */
public final class C3666i extends AbstractC3656B {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11144a;

    public /* synthetic */ C3666i(int i10) {
        this.f11144a = i10;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC3673p m4364c(C6381b c6381b, int i10) throws IOException {
        int iM24h = AbstractC0010F.m24h(i10);
        if (iM24h == 5) {
            return new C3678u(c6381b.mo5634x());
        }
        if (iM24h == 6) {
            return new C3678u(new C4617j(c6381b.mo5634x()));
        }
        if (iM24h == 7) {
            return new C3678u(Boolean.valueOf(c6381b.mo5619S0()));
        }
        if (iM24h != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(AbstractC3794B0.m4474I(i10)));
        }
        c6381b.mo5627e0();
        return C3675r.f11173Y;
    }

    /* JADX INFO: renamed from: d */
    public static void m4365d(C6382c c6382c, AbstractC3673p abstractC3673p) throws IOException {
        if (abstractC3673p == null || (abstractC3673p instanceof C3675r)) {
            c6382c.m7016W();
            return;
        }
        boolean z6 = abstractC3673p instanceof C3678u;
        if (z6) {
            if (!z6) {
                throw new IllegalStateException("Not a JSON Primitive: " + abstractC3673p);
            }
            C3678u c3678u = (C3678u) abstractC3673p;
            Serializable serializable = c3678u.f11175Y;
            if (serializable instanceof Number) {
                c6382c.m7009H0(c3678u.mo4383q());
                return;
            } else if (serializable instanceof Boolean) {
                c6382c.m7011N0(c3678u.mo4380f());
                return;
            } else {
                c6382c.m7010J0(c3678u.mo4384r());
                return;
            }
        }
        if (abstractC3673p instanceof C3671n) {
            c6382c.m7018e();
            Iterator it = abstractC3673p.m4389j().f11172Y.iterator();
            while (it.hasNext()) {
                m4365d(c6382c, (AbstractC3673p) it.next());
            }
            c6382c.m7008E();
            return;
        }
        if (!(abstractC3673p instanceof C3676s)) {
            throw new IllegalArgumentException("Couldn't write " + abstractC3673p.getClass());
        }
        c6382c.m7020k();
        Iterator it2 = ((C4619l) abstractC3673p.m4390m().f11174Y.entrySet()).iterator();
        while (((AbstractC4620m) it2).hasNext()) {
            C4621n c4621nM5364a = ((C4618k) it2).m5364a();
            c6382c.m7013S((String) c4621nM5364a.getKey());
            m4365d(c6382c, (AbstractC3673p) c4621nM5364a.getValue());
        }
        c6382c.m7012P();
    }

    @Override // p214Ib.AbstractC3656B
    /* JADX INFO: renamed from: a */
    public final Object mo4358a(C6381b c6381b) throws IOException {
        AbstractC3673p c3671n;
        AbstractC3673p c3671n2;
        boolean zMo5619S0;
        switch (this.f11144a) {
            case 0:
                if (c6381b.mo5616N0() != 9) {
                    return Double.valueOf(c6381b.mo5617O());
                }
                c6381b.mo5627e0();
                return null;
            case 1:
                if (c6381b.mo5616N0() != 9) {
                    return Float.valueOf((float) c6381b.mo5617O());
                }
                c6381b.mo5627e0();
                return null;
            case 2:
                if (c6381b.mo5616N0() != 9) {
                    return Long.valueOf(c6381b.mo5615E0());
                }
                c6381b.mo5627e0();
                return null;
            case 3:
                ArrayList arrayList = new ArrayList();
                c6381b.mo5621a();
                while (c6381b.hasNext()) {
                    try {
                        arrayList.add(Integer.valueOf(c6381b.mo5630g0()));
                    } catch (NumberFormatException e10) {
                        throw new C3679v(e10);
                    }
                }
                c6381b.mo5614E();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
                }
                return atomicIntegerArray;
            case 4:
                if (c6381b.mo5616N0() == 9) {
                    c6381b.mo5627e0();
                    return null;
                }
                try {
                    return Long.valueOf(c6381b.mo5615E0());
                } catch (NumberFormatException e11) {
                    throw new C3679v(e11);
                }
            case 5:
                if (c6381b.mo5616N0() != 9) {
                    return Float.valueOf((float) c6381b.mo5617O());
                }
                c6381b.mo5627e0();
                return null;
            case 6:
                if (c6381b.mo5616N0() != 9) {
                    return Double.valueOf(c6381b.mo5617O());
                }
                c6381b.mo5627e0();
                return null;
            case 7:
                if (c6381b.mo5616N0() == 9) {
                    c6381b.mo5627e0();
                    return null;
                }
                String strMo5634x = c6381b.mo5634x();
                if (strMo5634x.length() == 1) {
                    return Character.valueOf(strMo5634x.charAt(0));
                }
                StringBuilder sbM11058p = AbstractC10763a.m11058p("Expecting character, got: ", strMo5634x, "; at ");
                sbM11058p.append(c6381b.mo5633j0());
                throw new C3679v(sbM11058p.toString());
            case 8:
                int iMo5616N0 = c6381b.mo5616N0();
                if (iMo5616N0 != 9) {
                    return iMo5616N0 == 8 ? Boolean.toString(c6381b.mo5619S0()) : c6381b.mo5634x();
                }
                c6381b.mo5627e0();
                return null;
            case 9:
                if (c6381b.mo5616N0() == 9) {
                    c6381b.mo5627e0();
                    return null;
                }
                String strMo5634x2 = c6381b.mo5634x();
                try {
                    return new BigDecimal(strMo5634x2);
                } catch (NumberFormatException e12) {
                    StringBuilder sbM11058p2 = AbstractC10763a.m11058p("Failed parsing '", strMo5634x2, "' as BigDecimal; at path ");
                    sbM11058p2.append(c6381b.mo5633j0());
                    throw new C3679v(sbM11058p2.toString(), e12);
                }
            case 10:
                if (c6381b.mo5616N0() == 9) {
                    c6381b.mo5627e0();
                    return null;
                }
                String strMo5634x3 = c6381b.mo5634x();
                try {
                    return new BigInteger(strMo5634x3);
                } catch (NumberFormatException e13) {
                    StringBuilder sbM11058p3 = AbstractC10763a.m11058p("Failed parsing '", strMo5634x3, "' as BigInteger; at path ");
                    sbM11058p3.append(c6381b.mo5633j0());
                    throw new C3679v(sbM11058p3.toString(), e13);
                }
            case 11:
                if (c6381b.mo5616N0() != 9) {
                    return new C4617j(c6381b.mo5634x());
                }
                c6381b.mo5627e0();
                return null;
            case 12:
                if (c6381b.mo5616N0() != 9) {
                    return new StringBuilder(c6381b.mo5634x());
                }
                c6381b.mo5627e0();
                return null;
            case 13:
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            case 14:
                if (c6381b.mo5616N0() != 9) {
                    return new StringBuffer(c6381b.mo5634x());
                }
                c6381b.mo5627e0();
                return null;
            case 15:
                if (c6381b.mo5616N0() == 9) {
                    c6381b.mo5627e0();
                    return null;
                }
                String strMo5634x4 = c6381b.mo5634x();
                if ("null".equals(strMo5634x4)) {
                    return null;
                }
                return new URL(strMo5634x4);
            case 16:
                if (c6381b.mo5616N0() == 9) {
                    c6381b.mo5627e0();
                    return null;
                }
                try {
                    String strMo5634x5 = c6381b.mo5634x();
                    if ("null".equals(strMo5634x5)) {
                        return null;
                    }
                    return new URI(strMo5634x5);
                } catch (URISyntaxException e14) {
                    throw new C3674q(e14);
                }
            case 17:
                if (c6381b.mo5616N0() != 9) {
                    return InetAddress.getByName(c6381b.mo5634x());
                }
                c6381b.mo5627e0();
                return null;
            case 18:
                if (c6381b.mo5616N0() == 9) {
                    c6381b.mo5627e0();
                    return null;
                }
                String strMo5634x6 = c6381b.mo5634x();
                try {
                    return UUID.fromString(strMo5634x6);
                } catch (IllegalArgumentException e15) {
                    StringBuilder sbM11058p4 = AbstractC10763a.m11058p("Failed parsing '", strMo5634x6, "' as UUID; at path ");
                    sbM11058p4.append(c6381b.mo5633j0());
                    throw new C3679v(sbM11058p4.toString(), e15);
                }
            case 19:
                String strMo5634x7 = c6381b.mo5634x();
                try {
                    return Currency.getInstance(strMo5634x7);
                } catch (IllegalArgumentException e16) {
                    StringBuilder sbM11058p5 = AbstractC10763a.m11058p("Failed parsing '", strMo5634x7, "' as Currency; at path ");
                    sbM11058p5.append(c6381b.mo5633j0());
                    throw new C3679v(sbM11058p5.toString(), e16);
                }
            case 20:
                if (c6381b.mo5616N0() == 9) {
                    c6381b.mo5627e0();
                    return null;
                }
                c6381b.mo5626e();
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                while (c6381b.mo5616N0() != 4) {
                    String strMo5622a0 = c6381b.mo5622a0();
                    int iMo5630g0 = c6381b.mo5630g0();
                    if ("year".equals(strMo5622a0)) {
                        i11 = iMo5630g0;
                    } else if ("month".equals(strMo5622a0)) {
                        i12 = iMo5630g0;
                    } else if ("dayOfMonth".equals(strMo5622a0)) {
                        i13 = iMo5630g0;
                    } else if ("hourOfDay".equals(strMo5622a0)) {
                        i14 = iMo5630g0;
                    } else if ("minute".equals(strMo5622a0)) {
                        i15 = iMo5630g0;
                    } else if ("second".equals(strMo5622a0)) {
                        i16 = iMo5630g0;
                    }
                }
                c6381b.mo5618P();
                return new GregorianCalendar(i11, i12, i13, i14, i15, i16);
            case 21:
                if (c6381b.mo5616N0() == 9) {
                    c6381b.mo5627e0();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(c6381b.mo5634x(), "_");
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (strNextToken2 == null && strNextToken3 == null) {
                    return new Locale(strNextToken);
                }
                return strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
            case 22:
                if (c6381b instanceof C4975h) {
                    C4975h c4975h = (C4975h) c6381b;
                    int iMo5616N1 = c4975h.mo5616N0();
                    if (iMo5616N1 != 5 && iMo5616N1 != 2 && iMo5616N1 != 4 && iMo5616N1 != 10) {
                        AbstractC3673p abstractC3673p = (AbstractC3673p) c4975h.m5629f1();
                        c4975h.mo5613D();
                        return abstractC3673p;
                    }
                    throw new IllegalStateException("Unexpected " + AbstractC3794B0.m4474I(iMo5616N1) + " when reading a JsonElement.");
                }
                int iMo5616N2 = c6381b.mo5616N0();
                int iM24h = AbstractC0010F.m24h(iMo5616N2);
                if (iM24h == 0) {
                    c6381b.mo5621a();
                    c3671n = new C3671n();
                } else if (iM24h != 2) {
                    c3671n = null;
                } else {
                    c6381b.mo5626e();
                    c3671n = new C3676s();
                }
                if (c3671n == null) {
                    return m4364c(c6381b, iMo5616N2);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (c6381b.hasNext()) {
                        String strMo5622a1 = c3671n instanceof C3676s ? c6381b.mo5622a0() : null;
                        int iMo5616N3 = c6381b.mo5616N0();
                        int iM24h2 = AbstractC0010F.m24h(iMo5616N3);
                        if (iM24h2 == 0) {
                            c6381b.mo5621a();
                            c3671n2 = new C3671n();
                        } else if (iM24h2 != 2) {
                            c3671n2 = null;
                        } else {
                            c6381b.mo5626e();
                            c3671n2 = new C3676s();
                        }
                        boolean z6 = c3671n2 != null;
                        if (c3671n2 == null) {
                            c3671n2 = m4364c(c6381b, iMo5616N3);
                        }
                        if (c3671n instanceof C3671n) {
                            ((C3671n) c3671n).m4385s(c3671n2);
                        } else {
                            ((C3676s) c3671n).m4391s(strMo5622a1, c3671n2);
                        }
                        if (z6) {
                            arrayDeque.addLast(c3671n);
                            c3671n = c3671n2;
                        }
                    } else {
                        if (c3671n instanceof C3671n) {
                            c6381b.mo5614E();
                        } else {
                            c6381b.mo5618P();
                        }
                        if (arrayDeque.isEmpty()) {
                            return c3671n;
                        }
                        c3671n = (AbstractC3673p) arrayDeque.removeLast();
                    }
                }
                break;
            case 23:
                BitSet bitSet = new BitSet();
                c6381b.mo5621a();
                int iMo5616N4 = c6381b.mo5616N0();
                int i17 = 0;
                while (iMo5616N4 != 2) {
                    int iM24h3 = AbstractC0010F.m24h(iMo5616N4);
                    if (iM24h3 == 5 || iM24h3 == 6) {
                        int iMo5630g1 = c6381b.mo5630g0();
                        if (iMo5630g1 == 0) {
                            zMo5619S0 = false;
                        } else {
                            if (iMo5630g1 != 1) {
                                StringBuilder sbM11057o = AbstractC10763a.m11057o(iMo5630g1, "Invalid bitset value ", ", expected 0 or 1; at path ");
                                sbM11057o.append(c6381b.mo5633j0());
                                throw new C3679v(sbM11057o.toString());
                            }
                            zMo5619S0 = true;
                        }
                    } else {
                        if (iM24h3 != 7) {
                            throw new C3679v("Invalid bitset value type: " + AbstractC3794B0.m4474I(iMo5616N4) + "; at path " + c6381b.mo5620T());
                        }
                        zMo5619S0 = c6381b.mo5619S0();
                    }
                    if (zMo5619S0) {
                        bitSet.set(i17);
                    }
                    i17++;
                    iMo5616N4 = c6381b.mo5616N0();
                }
                c6381b.mo5614E();
                return bitSet;
            case 24:
                int iMo5616N5 = c6381b.mo5616N0();
                if (iMo5616N5 != 9) {
                    return iMo5616N5 == 6 ? Boolean.valueOf(Boolean.parseBoolean(c6381b.mo5634x())) : Boolean.valueOf(c6381b.mo5619S0());
                }
                c6381b.mo5627e0();
                return null;
            case 25:
                if (c6381b.mo5616N0() != 9) {
                    return Boolean.valueOf(c6381b.mo5634x());
                }
                c6381b.mo5627e0();
                return null;
            case 26:
                if (c6381b.mo5616N0() == 9) {
                    c6381b.mo5627e0();
                    return null;
                }
                try {
                    int iMo5630g2 = c6381b.mo5630g0();
                    if (iMo5630g2 <= 255 && iMo5630g2 >= -128) {
                        return Byte.valueOf((byte) iMo5630g2);
                    }
                    StringBuilder sbM11057o2 = AbstractC10763a.m11057o(iMo5630g2, "Lossy conversion from ", " to byte; at path ");
                    sbM11057o2.append(c6381b.mo5633j0());
                    throw new C3679v(sbM11057o2.toString());
                } catch (NumberFormatException e17) {
                    throw new C3679v(e17);
                }
            case 27:
                if (c6381b.mo5616N0() == 9) {
                    c6381b.mo5627e0();
                    return null;
                }
                try {
                    int iMo5630g3 = c6381b.mo5630g0();
                    if (iMo5630g3 <= 65535 && iMo5630g3 >= -32768) {
                        return Short.valueOf((short) iMo5630g3);
                    }
                    StringBuilder sbM11057o3 = AbstractC10763a.m11057o(iMo5630g3, "Lossy conversion from ", " to short; at path ");
                    sbM11057o3.append(c6381b.mo5633j0());
                    throw new C3679v(sbM11057o3.toString());
                } catch (NumberFormatException e18) {
                    throw new C3679v(e18);
                }
            default:
                if (c6381b.mo5616N0() == 9) {
                    c6381b.mo5627e0();
                    return null;
                }
                try {
                    return Integer.valueOf(c6381b.mo5630g0());
                } catch (NumberFormatException e19) {
                    throw new C3679v(e19);
                }
        }
    }

    @Override // p214Ib.AbstractC3656B
    /* JADX INFO: renamed from: b */
    public final void mo4359b(C6382c c6382c, Object obj) throws IOException {
        switch (this.f11144a) {
            case 0:
                Number number = (Number) obj;
                if (number == null) {
                    c6382c.m7016W();
                    return;
                }
                double dDoubleValue = number.doubleValue();
                C3669l.m4367a(dDoubleValue);
                c6382c.m7023v0(dDoubleValue);
                return;
            case 1:
                Number numberValueOf = (Number) obj;
                if (numberValueOf == null) {
                    c6382c.m7016W();
                    return;
                }
                float fFloatValue = numberValueOf.floatValue();
                C3669l.m4367a(fFloatValue);
                if (!(numberValueOf instanceof Float)) {
                    numberValueOf = Float.valueOf(fFloatValue);
                }
                c6382c.m7009H0(numberValueOf);
                return;
            case 2:
                Number number2 = (Number) obj;
                if (number2 == null) {
                    c6382c.m7016W();
                    return;
                } else {
                    c6382c.m7010J0(number2.toString());
                    return;
                }
            case 3:
                AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
                c6382c.m7018e();
                int length = atomicIntegerArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    c6382c.m7007C0(atomicIntegerArray.get(i10));
                }
                c6382c.m7008E();
                return;
            case 4:
                Number number3 = (Number) obj;
                if (number3 == null) {
                    c6382c.m7016W();
                    return;
                } else {
                    c6382c.m7007C0(number3.longValue());
                    return;
                }
            case 5:
                Number numberValueOf2 = (Number) obj;
                if (numberValueOf2 == null) {
                    c6382c.m7016W();
                    return;
                }
                if (!(numberValueOf2 instanceof Float)) {
                    numberValueOf2 = Float.valueOf(numberValueOf2.floatValue());
                }
                c6382c.m7009H0(numberValueOf2);
                return;
            case 6:
                Number number4 = (Number) obj;
                if (number4 == null) {
                    c6382c.m7016W();
                    return;
                } else {
                    c6382c.m7023v0(number4.doubleValue());
                    return;
                }
            case 7:
                Character ch2 = (Character) obj;
                c6382c.m7010J0(ch2 == null ? null : String.valueOf(ch2));
                return;
            case 8:
                c6382c.m7010J0((String) obj);
                return;
            case 9:
                c6382c.m7009H0((BigDecimal) obj);
                return;
            case 10:
                c6382c.m7009H0((BigInteger) obj);
                return;
            case 11:
                c6382c.m7009H0((C4617j) obj);
                return;
            case 12:
                StringBuilder sb2 = (StringBuilder) obj;
                c6382c.m7010J0(sb2 == null ? null : sb2.toString());
                return;
            case 13:
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?");
            case 14:
                StringBuffer stringBuffer = (StringBuffer) obj;
                c6382c.m7010J0(stringBuffer == null ? null : stringBuffer.toString());
                return;
            case 15:
                URL url = (URL) obj;
                c6382c.m7010J0(url == null ? null : url.toExternalForm());
                return;
            case 16:
                URI uri = (URI) obj;
                c6382c.m7010J0(uri == null ? null : uri.toASCIIString());
                return;
            case 17:
                InetAddress inetAddress = (InetAddress) obj;
                c6382c.m7010J0(inetAddress == null ? null : inetAddress.getHostAddress());
                return;
            case 18:
                UUID uuid = (UUID) obj;
                c6382c.m7010J0(uuid == null ? null : uuid.toString());
                return;
            case 19:
                c6382c.m7010J0(((Currency) obj).getCurrencyCode());
                return;
            case 20:
                Calendar calendar = (Calendar) obj;
                if (calendar == null) {
                    c6382c.m7016W();
                    return;
                }
                c6382c.m7020k();
                c6382c.m7013S("year");
                c6382c.m7007C0(calendar.get(1));
                c6382c.m7013S("month");
                c6382c.m7007C0(calendar.get(2));
                c6382c.m7013S("dayOfMonth");
                c6382c.m7007C0(calendar.get(5));
                c6382c.m7013S("hourOfDay");
                c6382c.m7007C0(calendar.get(11));
                c6382c.m7013S("minute");
                c6382c.m7007C0(calendar.get(12));
                c6382c.m7013S("second");
                c6382c.m7007C0(calendar.get(13));
                c6382c.m7012P();
                return;
            case 21:
                Locale locale = (Locale) obj;
                c6382c.m7010J0(locale == null ? null : locale.toString());
                return;
            case 22:
                m4365d(c6382c, (AbstractC3673p) obj);
                return;
            case 23:
                BitSet bitSet = (BitSet) obj;
                c6382c.m7018e();
                int length2 = bitSet.length();
                for (int i11 = 0; i11 < length2; i11++) {
                    c6382c.m7007C0(bitSet.get(i11) ? 1L : 0L);
                }
                c6382c.m7008E();
                return;
            case 24:
                Boolean bool = (Boolean) obj;
                if (bool == null) {
                    c6382c.m7016W();
                    return;
                }
                c6382c.m7015V0();
                c6382c.m7017a();
                c6382c.f20793Y.write(bool.booleanValue() ? "true" : "false");
                return;
            case 25:
                Boolean bool2 = (Boolean) obj;
                c6382c.m7010J0(bool2 == null ? "null" : bool2.toString());
                return;
            case 26:
                Number number5 = (Number) obj;
                if (number5 == null) {
                    c6382c.m7016W();
                    return;
                } else {
                    c6382c.m7007C0(number5.byteValue());
                    return;
                }
            case 27:
                Number number6 = (Number) obj;
                if (number6 == null) {
                    c6382c.m7016W();
                    return;
                } else {
                    c6382c.m7007C0(number6.shortValue());
                    return;
                }
            default:
                Number number7 = (Number) obj;
                if (number7 == null) {
                    c6382c.m7016W();
                    return;
                } else {
                    c6382c.m7007C0(number7.intValue());
                    return;
                }
        }
    }
}
