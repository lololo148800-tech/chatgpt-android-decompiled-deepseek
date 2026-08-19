package p214Ib;

import com.google.gson.reflect.TypeToken;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p001A.C0093v0;
import p265Kb.AbstractC4611d;
import p265Kb.C4615h;
import p265Kb.C4617j;
import p288Lb.AbstractC4992y;
import p288Lb.C4969b;
import p288Lb.C4970c;
import p288Lb.C4971d;
import p288Lb.C4975h;
import p288Lb.C4977j;
import p288Lb.C4978k;
import p288Lb.C4983p;
import p288Lb.C4988u;
import p288Lb.C4989v;
import p358Ob.AbstractC6164c;
import p379Pb.C6381b;
import p379Pb.C6382c;
import p379Pb.C6383d;
import p509Uk.lpqL.SfpOlmlMATQ;
import p817j$.util.DesugarCollections;
import p817j$.util.Objects;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: Ib.l */
/* JADX INFO: loaded from: classes.dex */
public final class C3669l {

    /* JADX INFO: renamed from: a */
    public final ThreadLocal f11148a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f11149b;

    /* JADX INFO: renamed from: c */
    public final C0093v0 f11150c;

    /* JADX INFO: renamed from: d */
    public final C4970c f11151d;

    /* JADX INFO: renamed from: e */
    public final List f11152e;

    /* JADX INFO: renamed from: f */
    public final Map f11153f;

    /* JADX INFO: renamed from: g */
    public final boolean f11154g;

    /* JADX INFO: renamed from: h */
    public final List f11155h;

    /* JADX INFO: renamed from: i */
    public final List f11156i;

    /* JADX INFO: renamed from: j */
    public final List f11157j;

    public C3669l() {
        this(C4615h.f15042o0, EnumC3665h.f11142Y, Collections.emptyMap(), true, true, 1, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), EnumC3655A.f11138Y, EnumC3655A.f11139Z, Collections.emptyList());
    }

    /* JADX INFO: renamed from: a */
    public static void m4367a(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m4368b(AbstractC3673p abstractC3673p, TypeToken typeToken) {
        if (abstractC3673p == null) {
            return null;
        }
        C4975h c4975h = new C4975h(C4975h.f16210F0);
        c4975h.f16212B0 = new Object[32];
        c4975h.f16213C0 = 0;
        c4975h.f16214D0 = new String[32];
        c4975h.f16215E0 = new int[32];
        c4975h.m5632h1(abstractC3673p);
        return m4369c(c4975h, typeToken);
    }

    /* JADX INFO: renamed from: c */
    public final Object m4369c(C6381b c6381b, TypeToken typeToken) {
        boolean z6 = c6381b.f20777Z;
        boolean z10 = true;
        c6381b.f20777Z = true;
        try {
            try {
                try {
                    try {
                        c6381b.mo5616N0();
                        z10 = false;
                        Object objMo4358a = m4372f(typeToken).mo4358a(c6381b);
                        c6381b.f20777Z = z6;
                        return objMo4358a;
                    } catch (EOFException e10) {
                        if (!z10) {
                            throw new C3679v(e10);
                        }
                        c6381b.f20777Z = z6;
                        return null;
                    }
                } catch (IllegalStateException e11) {
                    throw new C3679v(e11);
                }
            } catch (IOException e12) {
                throw new C3679v(e12);
            } catch (AssertionError e13) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e13.getMessage(), e13);
            }
        } catch (Throwable th2) {
            c6381b.f20777Z = z6;
            throw th2;
        }
    }

    /* JADX INFO: renamed from: e */
    public final Object m4371e(Class cls, String str) {
        return AbstractC4611d.m5353l(cls).cast(str == null ? null : m4370d(new StringReader(str), TypeToken.get(cls)));
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC3656B m4372f(TypeToken typeToken) {
        boolean z6;
        Objects.requireNonNull(typeToken, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.f11149b;
        AbstractC3656B abstractC3656B = (AbstractC3656B) concurrentHashMap.get(typeToken);
        if (abstractC3656B != null) {
            return abstractC3656B;
        }
        ThreadLocal threadLocal = this.f11148a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z6 = true;
        } else {
            AbstractC3656B abstractC3656B2 = (AbstractC3656B) map.get(typeToken);
            if (abstractC3656B2 != null) {
                return abstractC3656B2;
            }
            z6 = false;
        }
        try {
            C3668k c3668k = new C3668k();
            AbstractC3656B abstractC3656BMo4360a = null;
            c3668k.f11147a = null;
            map.put(typeToken, c3668k);
            Iterator it = this.f11152e.iterator();
            while (it.hasNext()) {
                abstractC3656BMo4360a = ((InterfaceC3657C) it.next()).mo4360a(this, typeToken);
                if (abstractC3656BMo4360a != null) {
                    if (c3668k.f11147a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    c3668k.f11147a = abstractC3656BMo4360a;
                    map.put(typeToken, abstractC3656BMo4360a);
                    break;
                }
            }
            if (z6) {
                threadLocal.remove();
            }
            if (abstractC3656BMo4360a != null) {
                if (z6) {
                    concurrentHashMap.putAll(map);
                }
                return abstractC3656BMo4360a;
            }
            throw new IllegalArgumentException("GSON (2.10.1) cannot handle " + typeToken);
        } catch (Throwable th2) {
            if (z6) {
                threadLocal.remove();
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC3656B m4373g(InterfaceC3657C interfaceC3657C, TypeToken typeToken) {
        List<InterfaceC3657C> list = this.f11152e;
        if (!list.contains(interfaceC3657C)) {
            interfaceC3657C = this.f11151d;
        }
        boolean z6 = false;
        for (InterfaceC3657C interfaceC3657C2 : list) {
            if (z6) {
                AbstractC3656B abstractC3656BMo4360a = interfaceC3657C2.mo4360a(this, typeToken);
                if (abstractC3656BMo4360a != null) {
                    return abstractC3656BMo4360a;
                }
            } else if (interfaceC3657C2 == interfaceC3657C) {
                z6 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + typeToken);
    }

    /* JADX INFO: renamed from: h */
    public final C6382c m4374h(Writer writer) {
        C6382c c6382c = new C6382c(writer);
        c6382c.f20798r0 = this.f11154g;
        c6382c.f20797q0 = false;
        c6382c.f20800t0 = false;
        return c6382c;
    }

    /* JADX INFO: renamed from: i */
    public final String m4375i(Object obj) {
        if (obj == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                m4376j(m4374h(stringWriter));
                return stringWriter.toString();
            } catch (IOException e10) {
                throw new C3674q(e10);
            }
        }
        Class cls = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            m4377k(obj, cls, m4374h(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e11) {
            throw new C3674q(e11);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m4376j(C6382c c6382c) {
        C3675r c3675r = C3675r.f11173Y;
        boolean z6 = c6382c.f20797q0;
        c6382c.f20797q0 = true;
        boolean z10 = c6382c.f20798r0;
        c6382c.f20798r0 = this.f11154g;
        boolean z11 = c6382c.f20800t0;
        c6382c.f20800t0 = false;
        try {
            try {
                C4988u c4988u = AbstractC4992y.f16272a;
                C3666i.m4365d(c6382c, c3675r);
                c6382c.f20797q0 = z6;
                c6382c.f20798r0 = z10;
                c6382c.f20800t0 = z11;
            } catch (IOException e10) {
                throw new C3674q(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e11.getMessage(), e11);
            }
        } catch (Throwable th2) {
            c6382c.f20797q0 = z6;
            c6382c.f20798r0 = z10;
            c6382c.f20800t0 = z11;
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m4377k(Object obj, Class cls, C6382c c6382c) {
        AbstractC3656B abstractC3656BM4372f = m4372f(TypeToken.get((Type) cls));
        boolean z6 = c6382c.f20797q0;
        c6382c.f20797q0 = true;
        boolean z10 = c6382c.f20798r0;
        c6382c.f20798r0 = this.f11154g;
        boolean z11 = c6382c.f20800t0;
        c6382c.f20800t0 = false;
        try {
            try {
                try {
                    abstractC3656BM4372f.mo4359b(c6382c, obj);
                    c6382c.f20797q0 = z6;
                    c6382c.f20798r0 = z10;
                    c6382c.f20800t0 = z11;
                } catch (IOException e10) {
                    throw new C3674q(e10);
                }
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e11.getMessage(), e11);
            }
        } catch (Throwable th2) {
            c6382c.f20797q0 = z6;
            c6382c.f20798r0 = z10;
            c6382c.f20800t0 = z11;
            throw th2;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f11152e + ",instanceCreators:" + this.f11150c + "}";
    }

    /* JADX INFO: renamed from: d */
    public final Object m4370d(Reader reader, TypeToken typeToken) {
        C6381b c6381b = new C6381b(reader);
        c6381b.f20777Z = false;
        Object objM4369c = m4369c(c6381b, typeToken);
        if (objM4369c != null) {
            try {
                if (c6381b.mo5616N0() != 10) {
                    throw new C3679v(SfpOlmlMATQ.zFMt);
                }
            } catch (C6383d e10) {
                throw new C3679v(e10);
            } catch (IOException e11) {
                throw new C3674q(e11);
            }
        }
        return objM4369c;
    }

    public C3669l(C4615h c4615h, EnumC3665h enumC3665h, Map map, boolean z6, boolean z10, int i10, List list, List list2, List list3, EnumC3655A enumC3655A, EnumC3655A enumC3655A2, List list4) {
        C4977j c4977j;
        C3666i c3666i;
        C4977j c4977j2;
        this.f11148a = new ThreadLocal();
        this.f11149b = new ConcurrentHashMap();
        this.f11153f = map;
        C0093v0 c0093v0 = new C0093v0(map, z10, list4, 4);
        this.f11150c = c0093v0;
        this.f11154g = z6;
        this.f11155h = list;
        this.f11156i = list2;
        this.f11157j = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(AbstractC4992y.f16270A);
        if (enumC3655A == EnumC3655A.f11138Y) {
            c4977j = C4978k.f16222c;
        } else {
            c4977j = new C4977j(enumC3655A, 1);
        }
        arrayList.add(c4977j);
        arrayList.add(c4615h);
        arrayList.addAll(list3);
        arrayList.add(AbstractC4992y.f16287p);
        arrayList.add(AbstractC4992y.f16278g);
        arrayList.add(AbstractC4992y.f16275d);
        arrayList.add(AbstractC4992y.f16276e);
        arrayList.add(AbstractC4992y.f16277f);
        if (i10 == 1) {
            c3666i = AbstractC4992y.f16282k;
        } else {
            c3666i = new C3666i(2);
        }
        arrayList.add(new C4989v(Long.TYPE, Long.class, c3666i));
        arrayList.add(new C4989v(Double.TYPE, Double.class, new C3666i(0)));
        arrayList.add(new C4989v(Float.TYPE, Float.class, new C3666i(1)));
        if (enumC3655A2 == EnumC3655A.f11139Z) {
            c4977j2 = C4971d.f16205d;
        } else {
            c4977j2 = new C4977j(new C4971d(enumC3655A2), 0);
        }
        arrayList.add(c4977j2);
        arrayList.add(AbstractC4992y.f16279h);
        arrayList.add(AbstractC4992y.f16280i);
        arrayList.add(new C4988u(AtomicLong.class, new C3667j(new C3667j(c3666i, 0), 2), 0));
        arrayList.add(new C4988u(AtomicLongArray.class, new C3667j(new C3667j(c3666i, 1), 2), 0));
        arrayList.add(AbstractC4992y.f16281j);
        arrayList.add(AbstractC4992y.f16283l);
        arrayList.add(AbstractC4992y.f16288q);
        arrayList.add(AbstractC4992y.f16289r);
        arrayList.add(new C4988u(BigDecimal.class, AbstractC4992y.f16284m, 0));
        arrayList.add(new C4988u(BigInteger.class, AbstractC4992y.f16285n, 0));
        arrayList.add(new C4988u(C4617j.class, AbstractC4992y.f16286o, 0));
        arrayList.add(AbstractC4992y.f16290s);
        arrayList.add(AbstractC4992y.f16291t);
        arrayList.add(AbstractC4992y.f16293v);
        arrayList.add(AbstractC4992y.f16294w);
        arrayList.add(AbstractC4992y.f16296y);
        arrayList.add(AbstractC4992y.f16292u);
        arrayList.add(AbstractC4992y.f16273b);
        arrayList.add(C4971d.f16204c);
        arrayList.add(AbstractC4992y.f16295x);
        if (AbstractC6164c.f20069a) {
            arrayList.add(AbstractC6164c.f20073e);
            arrayList.add(AbstractC6164c.f20072d);
            arrayList.add(AbstractC6164c.f20074f);
        }
        arrayList.add(C4969b.f16198d);
        arrayList.add(AbstractC4992y.f16272a);
        arrayList.add(new C4970c(c0093v0, 0));
        arrayList.add(new C4970c(c0093v0, 2));
        C4970c c4970c = new C4970c(c0093v0, 1);
        this.f11151d = c4970c;
        arrayList.add(c4970c);
        arrayList.add(AbstractC4992y.f16271B);
        arrayList.add(new C4983p(c0093v0, enumC3665h, c4615h, c4970c, list4));
        this.f11152e = DesugarCollections.unmodifiableList(arrayList);
    }
}
