package io.sentry;

import io.sentry.clientreport.C15334b;
import io.sentry.vendor.gson.stream.C15513a;
import io.sentry.vendor.gson.stream.EnumC15514b;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p389Pn.C6518c;
import p544W9.AbstractC8656j3;

/* JADX INFO: renamed from: io.sentry.h0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15360h0 implements Closeable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f47947Y = 0;

    /* JADX INFO: renamed from: Z */
    public final Object f47948Z;

    public C15360h0(Reader reader) {
        this.f47948Z = new C15513a(reader);
    }

    /* JADX INFO: renamed from: C0 */
    public final HashMap m16597C0(InterfaceC15127H interfaceC15127H, InterfaceC15176Y interfaceC15176Y) throws IOException {
        switch (this.f47947Y) {
            case 0:
                C15513a c15513a = (C15513a) this.f47948Z;
                if (c15513a.m16695C0() == EnumC15514b.NULL) {
                    c15513a.m16712e0();
                    return null;
                }
                c15513a.m16711e();
                HashMap map = new HashMap();
                if (c15513a.hasNext()) {
                    while (true) {
                        try {
                            map.put(c15513a.m16710a0(), interfaceC15176Y.mo16359a(this, interfaceC15127H));
                        } catch (Exception e10) {
                            interfaceC15127H.mo16297h(EnumC15375i1.WARNING, "Failed to deserialize object in map.", e10);
                        }
                        if (c15513a.m16695C0() == EnumC15514b.BEGIN_OBJECT || c15513a.m16695C0() == EnumC15514b.NAME) {
                        }
                        break;
                    }
                }
                c15513a.m16702P();
                return map;
            default:
                if (m16610X0() == EnumC15514b.NULL) {
                    m16615e0();
                    return null;
                }
                try {
                    m16614e();
                    HashMap map2 = new HashMap();
                    if (!((ArrayDeque) this.f47948Z).isEmpty()) {
                        while (true) {
                            try {
                                map2.put(m16613a0(), interfaceC15176Y.mo16359a(this, interfaceC15127H));
                            } catch (Exception e11) {
                                interfaceC15127H.mo16297h(EnumC15375i1.WARNING, "Failed to deserialize object in map.", e11);
                            }
                            if (m16610X0() == EnumC15514b.BEGIN_OBJECT || m16610X0() == EnumC15514b.NAME) {
                            }
                            break;
                        }
                    }
                    m16618k();
                    return map2;
                } catch (Exception e12) {
                    throw new IOException(e12);
                }
        }
    }

    /* JADX INFO: renamed from: E */
    public final Date m16598E(InterfaceC15127H interfaceC15127H) {
        switch (this.f47947Y) {
            case 0:
                C15513a c15513a = (C15513a) this.f47948Z;
                if (c15513a.m16695C0() == EnumC15514b.NULL) {
                    c15513a.m16712e0();
                    return null;
                }
                String strM16719x = c15513a.m16719x();
                if (strM16719x == null) {
                    return null;
                }
                try {
                    try {
                        return AbstractC8656j3.m9342j(strM16719x);
                    } catch (Exception unused) {
                        return AbstractC8656j3.m9343k(strM16719x);
                    }
                } catch (Exception e10) {
                    interfaceC15127H.mo16297h(EnumC15375i1.ERROR, "Error when deserializing millis timestamp format.", e10);
                    return null;
                }
            default:
                String str = (String) m16609W0();
                if (str == null) {
                    return null;
                }
                try {
                    try {
                        return AbstractC8656j3.m9342j(str);
                    } catch (Exception e11) {
                        interfaceC15127H.mo16297h(EnumC15375i1.ERROR, "Error when deserializing millis timestamp format.", e11);
                        return null;
                    }
                } catch (Exception unused2) {
                    return AbstractC8656j3.m9343k(str);
                }
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final long m16599E0() throws IOException {
        switch (this.f47947Y) {
            case 0:
                return ((C15513a) this.f47948Z).m16697E0();
            default:
                Object objM16609W0 = m16609W0();
                if (objM16609W0 instanceof Number) {
                    return ((Number) objM16609W0).longValue();
                }
                throw new IOException("Expected long");
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final Object m16600H0() {
        switch (this.f47947Y) {
            case 0:
                C6518c c6518c = new C6518c(1);
                c6518c.m7091e(this);
                InterfaceC15325c0 interfaceC15325c0M7088b = c6518c.m7088b();
                if (interfaceC15325c0M7088b != null) {
                    return interfaceC15325c0M7088b.getValue();
                }
                return null;
            default:
                return m16609W0();
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final Object m16601J0(InterfaceC15127H interfaceC15127H, InterfaceC15176Y interfaceC15176Y) {
        switch (this.f47947Y) {
            case 0:
                C15513a c15513a = (C15513a) this.f47948Z;
                if (c15513a.m16695C0() != EnumC15514b.NULL) {
                    return interfaceC15176Y.mo16359a(this, interfaceC15127H);
                }
                c15513a.m16712e0();
                return null;
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.f47948Z;
                Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
                if (entry == null) {
                    return null;
                }
                Object value = entry.getValue();
                if (interfaceC15127H != null) {
                    return interfaceC15176Y.mo16359a(this, interfaceC15127H);
                }
                arrayDeque.removeLast();
                return value;
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final String m16602N0() {
        switch (this.f47947Y) {
            case 0:
                C15513a c15513a = (C15513a) this.f47948Z;
                if (c15513a.m16695C0() != EnumC15514b.NULL) {
                    return c15513a.m16719x();
                }
                c15513a.m16712e0();
                return null;
            default:
                return (String) m16609W0();
        }
    }

    /* JADX INFO: renamed from: O */
    public final double m16603O() throws IOException {
        switch (this.f47947Y) {
            case 0:
                return ((C15513a) this.f47948Z).m16701O();
            default:
                Object objM16609W0 = m16609W0();
                if (objM16609W0 instanceof Number) {
                    return ((Number) objM16609W0).doubleValue();
                }
                throw new IOException("Expected double");
        }
    }

    /* JADX INFO: renamed from: P */
    public final Double m16604P() throws IOException {
        switch (this.f47947Y) {
            case 0:
                C15513a c15513a = (C15513a) this.f47948Z;
                if (c15513a.m16695C0() != EnumC15514b.NULL) {
                    return Double.valueOf(c15513a.m16701O());
                }
                c15513a.m16712e0();
                return null;
            default:
                Object objM16609W0 = m16609W0();
                if (objM16609W0 instanceof Number) {
                    return Double.valueOf(((Number) objM16609W0).doubleValue());
                }
                return null;
        }
    }

    /* JADX INFO: renamed from: S */
    public final float m16605S() throws IOException {
        switch (this.f47947Y) {
            case 0:
                return (float) ((C15513a) this.f47948Z).m16701O();
            default:
                Object objM16609W0 = m16609W0();
                if (objM16609W0 instanceof Number) {
                    return ((Number) objM16609W0).floatValue();
                }
                throw new IOException("Expected float");
        }
    }

    /* JADX INFO: renamed from: T */
    public final Float m16606T() throws IOException {
        switch (this.f47947Y) {
            case 0:
                C15513a c15513a = (C15513a) this.f47948Z;
                if (c15513a.m16695C0() != EnumC15514b.NULL) {
                    return Float.valueOf(m16605S());
                }
                c15513a.m16712e0();
                return null;
            default:
                Object objM16609W0 = m16609W0();
                if (objM16609W0 instanceof Number) {
                    return Float.valueOf(((Number) objM16609W0).floatValue());
                }
                return null;
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final void m16607V0(InterfaceC15127H interfaceC15127H, AbstractMap abstractMap, String str) {
        switch (this.f47947Y) {
            case 0:
                try {
                    abstractMap.put(str, m16600H0());
                } catch (Exception e10) {
                    interfaceC15127H.mo16296g(EnumC15375i1.ERROR, e10, "Error deserializing unknown key: %s", str);
                }
                break;
            default:
                try {
                    abstractMap.put(str, m16609W0());
                } catch (Exception e11) {
                    interfaceC15127H.mo16296g(EnumC15375i1.ERROR, e11, "Error deserializing unknown key: %s", str);
                    return;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: W */
    public final Integer m16608W() throws IOException {
        switch (this.f47947Y) {
            case 0:
                C15513a c15513a = (C15513a) this.f47948Z;
                if (c15513a.m16695C0() != EnumC15514b.NULL) {
                    return Integer.valueOf(c15513a.m16713g0());
                }
                c15513a.m16712e0();
                return null;
            default:
                Object objM16609W0 = m16609W0();
                if (objM16609W0 instanceof Number) {
                    return Integer.valueOf(((Number) objM16609W0).intValue());
                }
                return null;
        }
    }

    /* JADX INFO: renamed from: W0 */
    public Object m16609W0() throws IOException {
        try {
            ArrayDeque arrayDeque = (ArrayDeque) this.f47948Z;
            Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
            if (entry == null) {
                return null;
            }
            Object value = entry.getValue();
            arrayDeque.removeLast();
            return value;
        } catch (Exception e10) {
            throw new IOException(e10);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final EnumC15514b m16610X0() {
        switch (this.f47947Y) {
            case 0:
                return ((C15513a) this.f47948Z).m16695C0();
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.f47948Z;
                if (arrayDeque.isEmpty()) {
                    return EnumC15514b.END_DOCUMENT;
                }
                Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
                if (entry == null) {
                    return EnumC15514b.END_DOCUMENT;
                }
                if (entry.getKey() != null) {
                    return EnumC15514b.NAME;
                }
                Object value = entry.getValue();
                if (value instanceof Map) {
                    return EnumC15514b.BEGIN_OBJECT;
                }
                if (value instanceof List) {
                    return EnumC15514b.BEGIN_ARRAY;
                }
                if (value instanceof String) {
                    return EnumC15514b.STRING;
                }
                if (value instanceof Number) {
                    return EnumC15514b.NUMBER;
                }
                if (value instanceof Boolean) {
                    return EnumC15514b.BOOLEAN;
                }
                return value instanceof EnumC15514b ? (EnumC15514b) value : EnumC15514b.END_DOCUMENT;
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m16611Y0(boolean z6) {
        switch (this.f47947Y) {
            case 0:
                ((C15513a) this.f47948Z).f48443Z = z6;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m16612a() throws IOException {
        ArrayDeque arrayDeque = (ArrayDeque) this.f47948Z;
        Map.Entry entry = (Map.Entry) arrayDeque.removeLast();
        if (entry == null) {
            throw new IOException("No more entries");
        }
        Object value = entry.getValue();
        if (!(value instanceof List)) {
            throw new IOException("Current token is not an object");
        }
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, EnumC15514b.END_ARRAY));
        List list = (List) value;
        for (int size = list.size() - 1; size >= 0; size--) {
            arrayDeque.addLast(new AbstractMap.SimpleEntry(null, list.get(size)));
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final String m16613a0() throws IOException {
        switch (this.f47947Y) {
            case 0:
                return ((C15513a) this.f47948Z).m16710a0();
            default:
                Map.Entry entry = (Map.Entry) ((ArrayDeque) this.f47948Z).peekLast();
                if (entry != null && entry.getKey() != null) {
                    return (String) entry.getKey();
                }
                throw new IOException("Expected a name but was " + m16610X0());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f47947Y) {
            case 0:
                ((C15513a) this.f47948Z).close();
                break;
            default:
                ((ArrayDeque) this.f47948Z).clear();
                break;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m16614e() throws IOException {
        switch (this.f47947Y) {
            case 0:
                ((C15513a) this.f47948Z).m16711e();
                return;
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.f47948Z;
                Map.Entry entry = (Map.Entry) arrayDeque.removeLast();
                if (entry == null) {
                    throw new IOException("No more entries");
                }
                Object value = entry.getValue();
                if (!(value instanceof Map)) {
                    throw new IOException("Current token is not an object");
                }
                arrayDeque.addLast(new AbstractMap.SimpleEntry(null, EnumC15514b.END_OBJECT));
                Iterator it = ((Map) value).entrySet().iterator();
                while (it.hasNext()) {
                    arrayDeque.addLast((Map.Entry) it.next());
                }
                return;
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m16615e0() throws IOException {
        if (m16609W0() == null) {
            return;
        }
        throw new IOException("Expected null but was " + m16610X0());
    }

    /* JADX INFO: renamed from: g0 */
    public final int m16616g0() throws IOException {
        switch (this.f47947Y) {
            case 0:
                return ((C15513a) this.f47948Z).m16713g0();
            default:
                Object objM16609W0 = m16609W0();
                if (objM16609W0 instanceof Number) {
                    return ((Number) objM16609W0).intValue();
                }
                throw new IOException("Expected int");
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final ArrayList m16617j0(InterfaceC15127H interfaceC15127H, InterfaceC15176Y interfaceC15176Y) throws IOException {
        switch (this.f47947Y) {
            case 0:
                C15513a c15513a = (C15513a) this.f47948Z;
                if (c15513a.m16695C0() == EnumC15514b.NULL) {
                    c15513a.m16712e0();
                    return null;
                }
                c15513a.m16709a();
                ArrayList arrayList = new ArrayList();
                if (c15513a.hasNext()) {
                    do {
                        try {
                            arrayList.add(interfaceC15176Y.mo16359a(this, interfaceC15127H));
                        } catch (Exception e10) {
                            interfaceC15127H.mo16297h(EnumC15375i1.WARNING, "Failed to deserialize object in list.", e10);
                        }
                        break;
                    } while (c15513a.m16695C0() == EnumC15514b.BEGIN_OBJECT);
                }
                c15513a.m16696E();
                return arrayList;
            default:
                if (m16610X0() == EnumC15514b.NULL) {
                    m16615e0();
                    return null;
                }
                try {
                    m16612a();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayDeque arrayDeque = (ArrayDeque) this.f47948Z;
                    if (!arrayDeque.isEmpty()) {
                        do {
                            try {
                                arrayList2.add(interfaceC15176Y.mo16359a(this, interfaceC15127H));
                            } catch (Exception e11) {
                                interfaceC15127H.mo16297h(EnumC15375i1.WARNING, "Failed to deserialize object in list.", e11);
                            }
                            break;
                        } while (m16610X0() == EnumC15514b.BEGIN_OBJECT);
                    }
                    if (arrayDeque.size() > 1) {
                        arrayDeque.removeLast();
                        break;
                    }
                    return arrayList2;
                } catch (Exception e12) {
                    throw new IOException(e12);
                }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m16618k() {
        switch (this.f47947Y) {
            case 0:
                ((C15513a) this.f47948Z).m16702P();
                break;
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.f47948Z;
                if (arrayDeque.size() > 1) {
                    arrayDeque.removeLast();
                }
                break;
        }
    }

    /* JADX INFO: renamed from: m */
    public final Boolean m16619m() {
        switch (this.f47947Y) {
            case 0:
                C15513a c15513a = (C15513a) this.f47948Z;
                if (c15513a.m16695C0() != EnumC15514b.NULL) {
                    return Boolean.valueOf(c15513a.m16704S0());
                }
                c15513a.m16712e0();
                return null;
            default:
                return (Boolean) m16609W0();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final Long m16620r0() throws IOException {
        switch (this.f47947Y) {
            case 0:
                C15513a c15513a = (C15513a) this.f47948Z;
                if (c15513a.m16695C0() != EnumC15514b.NULL) {
                    return Long.valueOf(c15513a.m16697E0());
                }
                c15513a.m16712e0();
                return null;
            default:
                Object objM16609W0 = m16609W0();
                if (objM16609W0 instanceof Number) {
                    return Long.valueOf(((Number) objM16609W0).longValue());
                }
                return null;
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final HashMap m16621v0(InterfaceC15127H interfaceC15127H, C15334b c15334b) throws IOException {
        switch (this.f47947Y) {
            case 0:
                C15513a c15513a = (C15513a) this.f47948Z;
                if (c15513a.m16695C0() == EnumC15514b.NULL) {
                    c15513a.m16712e0();
                    return null;
                }
                HashMap map = new HashMap();
                m16614e();
                if (c15513a.hasNext()) {
                    while (true) {
                        String strM16710a0 = c15513a.m16710a0();
                        ArrayList arrayListM16617j0 = m16617j0(interfaceC15127H, c15334b);
                        if (arrayListM16617j0 != null) {
                            map.put(strM16710a0, arrayListM16617j0);
                        }
                        if (c15513a.m16695C0() == EnumC15514b.BEGIN_OBJECT || c15513a.m16695C0() == EnumC15514b.NAME) {
                        }
                    }
                }
                m16618k();
                return map;
            default:
                if (m16610X0() == EnumC15514b.NULL) {
                    m16615e0();
                    return null;
                }
                HashMap map2 = new HashMap();
                try {
                    m16614e();
                    if (!((ArrayDeque) this.f47948Z).isEmpty()) {
                        while (true) {
                            String strM16613a0 = m16613a0();
                            ArrayList arrayListM16617j1 = m16617j0(interfaceC15127H, c15334b);
                            if (arrayListM16617j1 != null) {
                                map2.put(strM16613a0, arrayListM16617j1);
                            }
                            if (m16610X0() == EnumC15514b.BEGIN_OBJECT || m16610X0() == EnumC15514b.NAME) {
                            }
                        }
                    }
                    m16618k();
                    return map2;
                } catch (Exception e10) {
                    throw new IOException(e10);
                }
        }
    }

    /* JADX INFO: renamed from: x */
    public final String m16622x() throws IOException {
        switch (this.f47947Y) {
            case 0:
                return ((C15513a) this.f47948Z).m16719x();
            default:
                String str = (String) m16609W0();
                if (str != null) {
                    return str;
                }
                throw new IOException("Expected string");
        }
    }

    public C15360h0(Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f47948Z = arrayDeque;
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, map));
    }

    /* JADX INFO: renamed from: a1 */
    private final void m16596a1() {
    }

    /* JADX INFO: renamed from: Z0 */
    private final void m16595Z0(boolean z6) {
    }
}
