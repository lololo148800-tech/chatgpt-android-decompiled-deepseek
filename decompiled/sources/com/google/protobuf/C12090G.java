package com.google.protobuf;

import androidx.datastore.preferences.protobuf.C10997z;
import androidx.glance.appwidget.protobuf.C11005A;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p370P0.C6277D;

/* JADX INFO: renamed from: com.google.protobuf.G */
/* JADX INFO: loaded from: classes3.dex */
public final class C12090G {
    /* JADX INFO: renamed from: a */
    public static int m13740a(Map.Entry entry) {
        return ((C12127W) entry.getKey()).f36983Y;
    }

    /* JADX INFO: renamed from: b */
    public static C12129X m13741b(C12087F c12087f, InterfaceC12091G0 interfaceC12091G0, int i10) {
        return c12087f.m13738a(i10, interfaceC12091G0);
    }

    /* JADX INFO: renamed from: c */
    public static C12110N m13742c(Object obj) {
        return ((GeneratedMessageLite$ExtendableMessage) obj).extensions;
    }

    /* JADX INFO: renamed from: d */
    public static C12110N m13743d(Object obj) {
        return ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable();
    }

    /* JADX INFO: renamed from: e */
    public static void m13744e(Object obj) {
        ((GeneratedMessageLite$ExtendableMessage) obj).extensions.m13850m();
    }

    /* JADX INFO: renamed from: f */
    public static Object m13745f(Object obj, C6277D c6277d, C12129X c12129x, C12087F c12087f, C12110N c12110n, Object obj2, C12185q1 c12185q1) throws C10997z, C11005A, C12181p0 {
        Object objValueOf;
        Object obj3;
        List arrayList;
        C12127W c12127w = c12129x.f36993d;
        int i10 = c12127w.f36983Y;
        EnumC12101J1 enumC12101J1 = c12127w.f36984Z;
        if (c12127w.f36985o0 && c12127w.f36986p0) {
            switch (enumC12101J1.ordinal()) {
                case 0:
                    arrayList = new ArrayList();
                    c6277d.m6830t(arrayList);
                    break;
                case 1:
                    arrayList = new ArrayList();
                    c6277d.m6773H(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    c6277d.m6781P(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    c6277d.m6821o0(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    c6277d.m6778M(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    c6277d.m6770E(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    c6277d.m6767B(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    c6277d.m6814l(arrayList);
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    throw new IllegalStateException("Type cannot be packed: " + c12127w.f36984Z);
                case 12:
                    arrayList = new ArrayList();
                    c6277d.m6815l0(arrayList);
                    break;
                case 13:
                    ArrayList arrayList2 = new ArrayList();
                    c6277d.m6835w(arrayList2);
                    obj2 = AbstractC12137a1.m13927z(obj, i10, arrayList2, null, obj2, c12185q1);
                    arrayList = arrayList2;
                    break;
                case 14:
                    arrayList = new ArrayList();
                    c6277d.m6787V(arrayList);
                    break;
                case 15:
                    arrayList = new ArrayList();
                    c6277d.m6790Y(arrayList);
                    break;
                case 16:
                    arrayList = new ArrayList();
                    c6277d.m6795b0(arrayList);
                    break;
                case 17:
                    arrayList = new ArrayList();
                    c6277d.m6801e0(arrayList);
                    break;
            }
            c12110n.m13853p(c12127w, arrayList);
        } else {
            if (enumC12101J1 == EnumC12101J1.f36920t0) {
                c6277d.m6829s0(0);
                ((AbstractC12186r) c6277d.f20385e).mo14043t();
                throw null;
            }
            int iOrdinal = enumC12101J1.ordinal();
            InterfaceC12091G0 interfaceC12091G0 = c12129x.f36992c;
            switch (iOrdinal) {
                case 0:
                    c6277d.m6829s0(1);
                    objValueOf = Double.valueOf(((AbstractC12186r) c6277d.f20385e).mo14037n());
                    break;
                case 1:
                    c6277d.m6829s0(5);
                    objValueOf = Float.valueOf(((AbstractC12186r) c6277d.f20385e).mo14041r());
                    break;
                case 2:
                    c6277d.m6829s0(0);
                    objValueOf = Long.valueOf(((AbstractC12186r) c6277d.f20385e).mo14044u());
                    break;
                case 3:
                    c6277d.m6829s0(0);
                    objValueOf = Long.valueOf(((AbstractC12186r) c6277d.f20385e).mo14021G());
                    break;
                case 4:
                    c6277d.m6829s0(0);
                    objValueOf = Integer.valueOf(((AbstractC12186r) c6277d.f20385e).mo14043t());
                    break;
                case 5:
                    c6277d.m6829s0(1);
                    objValueOf = Long.valueOf(((AbstractC12186r) c6277d.f20385e).mo14040q());
                    break;
                case 6:
                    c6277d.m6829s0(5);
                    objValueOf = Integer.valueOf(((AbstractC12186r) c6277d.f20385e).mo14039p());
                    break;
                case 7:
                    c6277d.m6829s0(0);
                    objValueOf = Boolean.valueOf(((AbstractC12186r) c6277d.f20385e).mo14035l());
                    break;
                case 8:
                    c6277d.m6829s0(2);
                    objValueOf = ((AbstractC12186r) c6277d.f20385e).mo14017C();
                    break;
                case 9:
                    if (!c12127w.f36985o0) {
                        Object obj4 = c12110n.f36962a.get(c12127w);
                        if (obj4 instanceof AbstractC12133Z) {
                            InterfaceC12134Z0 interfaceC12134Z0M13869b = C12128W0.f36987c.m13869b(obj4);
                            if (!((AbstractC12133Z) obj4).isMutable()) {
                                Object objMo13789c = interfaceC12134Z0M13869b.mo13789c();
                                interfaceC12134Z0M13869b.mo13790d(objMo13789c, obj4);
                                c12110n.m13853p(c12127w, objMo13789c);
                                obj4 = objMo13789c;
                            }
                            c6277d.m6829s0(3);
                            c6277d.m6804g(obj4, interfaceC12134Z0M13869b, c12087f);
                            return obj2;
                        }
                    }
                    Class<?> cls = interfaceC12091G0.getClass();
                    c6277d.m6829s0(3);
                    InterfaceC12134Z0 interfaceC12134Z0M13868a = C12128W0.f36987c.m13868a(cls);
                    Object objMo13789c2 = interfaceC12134Z0M13868a.mo13789c();
                    c6277d.m6804g(objMo13789c2, interfaceC12134Z0M13868a, c12087f);
                    interfaceC12134Z0M13868a.mo13785a(objMo13789c2);
                    objValueOf = objMo13789c2;
                    break;
                case 10:
                    if (!c12127w.f36985o0) {
                        Object obj5 = c12110n.f36962a.get(c12127w);
                        if (obj5 instanceof AbstractC12133Z) {
                            InterfaceC12134Z0 interfaceC12134Z0M13869b2 = C12128W0.f36987c.m13869b(obj5);
                            if (!((AbstractC12133Z) obj5).isMutable()) {
                                Object objMo13789c3 = interfaceC12134Z0M13869b2.mo13789c();
                                interfaceC12134Z0M13869b2.mo13790d(objMo13789c3, obj5);
                                c12110n.m13853p(c12127w, objMo13789c3);
                                obj5 = objMo13789c3;
                            }
                            c6277d.m6829s0(2);
                            c6277d.m6808i(obj5, interfaceC12134Z0M13869b2, c12087f);
                            return obj2;
                        }
                    }
                    objValueOf = c6277d.m6782Q(interfaceC12091G0.getClass(), c12087f);
                    break;
                case 11:
                    objValueOf = c6277d.m6820o();
                    break;
                case 12:
                    c6277d.m6829s0(0);
                    objValueOf = Integer.valueOf(((AbstractC12186r) c6277d.f20385e).mo14020F());
                    break;
                case 13:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 14:
                    c6277d.m6829s0(5);
                    objValueOf = Integer.valueOf(((AbstractC12186r) c6277d.f20385e).mo14047y());
                    break;
                case 15:
                    c6277d.m6829s0(1);
                    objValueOf = Long.valueOf(((AbstractC12186r) c6277d.f20385e).mo14048z());
                    break;
                case 16:
                    c6277d.m6829s0(0);
                    objValueOf = Integer.valueOf(((AbstractC12186r) c6277d.f20385e).mo14015A());
                    break;
                case 17:
                    c6277d.m6829s0(0);
                    objValueOf = Long.valueOf(((AbstractC12186r) c6277d.f20385e).mo14016B());
                    break;
                default:
                    objValueOf = null;
                    break;
            }
            if (c12127w.f36985o0) {
                c12110n.m13843a(c12127w, objValueOf);
            } else {
                int iOrdinal2 = c12127w.f36984Z.ordinal();
                if ((iOrdinal2 == 9 || iOrdinal2 == 10) && (obj3 = c12110n.f36962a.get(c12127w)) != null) {
                    InterfaceC12091G0 interfaceC12091G1 = (InterfaceC12091G0) objValueOf;
                    AbstractC12121T abstractC12121T = (AbstractC12121T) ((InterfaceC12091G0) obj3).toBuilder();
                    if (!abstractC12121T.f36980Y.getClass().isInstance(interfaceC12091G1)) {
                        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
                    }
                    abstractC12121T.m13865f((AbstractC12133Z) ((AbstractC12138b) interfaceC12091G1));
                    objValueOf = abstractC12121T.m13862c();
                }
                c12110n.m13853p(c12127w, objValueOf);
            }
        }
        return obj2;
    }

    /* JADX INFO: renamed from: g */
    public static void m13746g(C12211z0 c12211z0, Map.Entry entry) {
        C12127W c12127w = (C12127W) entry.getKey();
        boolean z6 = c12127w.f36985o0;
        EnumC12101J1 enumC12101J1 = c12127w.f36984Z;
        int i10 = c12127w.f36983Y;
        if (!z6) {
            switch (enumC12101J1.ordinal()) {
                case 0:
                    c12211z0.m14202c(i10, ((Double) entry.getValue()).doubleValue());
                    break;
                case 1:
                    c12211z0.m14206g(i10, ((Float) entry.getValue()).floatValue());
                    break;
                case 2:
                    c12211z0.m14209j(i10, ((Long) entry.getValue()).longValue());
                    break;
                case 3:
                    c12211z0.m14216q(i10, ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    c12211z0.m14208i(i10, ((Integer) entry.getValue()).intValue());
                    break;
                case 5:
                    c12211z0.m14205f(i10, ((Long) entry.getValue()).longValue());
                    break;
                case 6:
                    c12211z0.m14204e(i10, ((Integer) entry.getValue()).intValue());
                    break;
                case 7:
                    c12211z0.m14200a(i10, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 8:
                    ((AbstractC12195u) c12211z0.f37131a).mo14106O0(i10, (String) entry.getValue());
                    break;
                case 9:
                    c12211z0.m14207h(i10, entry.getValue(), C12128W0.f36987c.m13868a(entry.getValue().getClass()));
                    break;
                case 10:
                    c12211z0.m14210k(i10, entry.getValue(), C12128W0.f36987c.m13868a(entry.getValue().getClass()));
                    break;
                case 11:
                    c12211z0.m14201b(i10, (AbstractC12171m) entry.getValue());
                    break;
                case 12:
                    c12211z0.m14215p(i10, ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    c12211z0.m14208i(i10, ((Integer) entry.getValue()).intValue());
                    break;
                case 14:
                    c12211z0.m14211l(i10, ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    c12211z0.m14212m(i10, ((Long) entry.getValue()).longValue());
                    break;
                case 16:
                    c12211z0.m14213n(i10, ((Integer) entry.getValue()).intValue());
                    break;
                case 17:
                    c12211z0.m14214o(i10, ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        int iOrdinal = enumC12101J1.ordinal();
        boolean z10 = c12127w.f36986p0;
        switch (iOrdinal) {
            case 0:
                AbstractC12137a1.m13886G(i10, (List) entry.getValue(), c12211z0, z10);
                break;
            case 1:
                AbstractC12137a1.m13890K(i10, (List) entry.getValue(), c12211z0, z10);
                break;
            case 2:
                AbstractC12137a1.m13893N(i10, (List) entry.getValue(), c12211z0, z10);
                break;
            case 3:
                AbstractC12137a1.m13901V(i10, (List) entry.getValue(), c12211z0, z10);
                break;
            case 4:
                AbstractC12137a1.m13892M(i10, (List) entry.getValue(), c12211z0, z10);
                break;
            case 5:
                AbstractC12137a1.m13889J(i10, (List) entry.getValue(), c12211z0, z10);
                break;
            case 6:
                AbstractC12137a1.m13888I(i10, (List) entry.getValue(), c12211z0, z10);
                break;
            case 7:
                AbstractC12137a1.m13884E(i10, (List) entry.getValue(), c12211z0, z10);
                break;
            case 8:
                AbstractC12137a1.m13899T(i10, (List) entry.getValue(), c12211z0);
                break;
            case 9:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    AbstractC12137a1.m13891L(i10, (List) entry.getValue(), c12211z0, C12128W0.f36987c.m13868a(list.get(0).getClass()));
                    break;
                }
                break;
            case 10:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    AbstractC12137a1.m13894O(i10, (List) entry.getValue(), c12211z0, C12128W0.f36987c.m13868a(list2.get(0).getClass()));
                    break;
                }
                break;
            case 11:
                AbstractC12137a1.m13885F(i10, (List) entry.getValue(), c12211z0);
                break;
            case 12:
                AbstractC12137a1.m13900U(i10, (List) entry.getValue(), c12211z0, z10);
                break;
            case 13:
                AbstractC12137a1.m13892M(i10, (List) entry.getValue(), c12211z0, z10);
                break;
            case 14:
                AbstractC12137a1.m13895P(i10, (List) entry.getValue(), c12211z0, z10);
                break;
            case 15:
                AbstractC12137a1.m13896Q(i10, (List) entry.getValue(), c12211z0, z10);
                break;
            case 16:
                AbstractC12137a1.m13897R(i10, (List) entry.getValue(), c12211z0, z10);
                break;
            case 17:
                AbstractC12137a1.m13898S(i10, (List) entry.getValue(), c12211z0, z10);
                break;
        }
    }
}
