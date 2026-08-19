package com.google.protobuf;

import androidx.glance.appwidget.protobuf.C11064z;
import java.util.Iterator;
import java.util.Map;
import p002A0.C0138o;
import p370P0.C6277D;

/* JADX INFO: renamed from: com.google.protobuf.K0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12103K0 implements InterfaceC12134Z0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC12091G0 f36946a;

    /* JADX INFO: renamed from: b */
    public final C12185q1 f36947b;

    /* JADX INFO: renamed from: c */
    public final boolean f36948c;

    /* JADX INFO: renamed from: d */
    public final C12090G f36949d;

    public C12103K0(C12185q1 c12185q1, C12090G c12090g, InterfaceC12091G0 interfaceC12091G0) {
        this.f36947b = c12185q1;
        c12090g.getClass();
        this.f36948c = interfaceC12091G0 instanceof GeneratedMessageLite$ExtendableMessage;
        this.f36949d = c12090g;
        this.f36946a = interfaceC12091G0;
    }

    @Override // com.google.protobuf.InterfaceC12134Z0
    /* JADX INFO: renamed from: a */
    public final void mo13785a(Object obj) {
        this.f36947b.getClass();
        C12185q1.m14081b(obj);
        this.f36949d.getClass();
        C12090G.m13744e(obj);
    }

    @Override // com.google.protobuf.InterfaceC12134Z0
    /* JADX INFO: renamed from: b */
    public final boolean mo13787b(Object obj) {
        this.f36949d.getClass();
        return ((GeneratedMessageLite$ExtendableMessage) obj).extensions.m13848j();
    }

    @Override // com.google.protobuf.InterfaceC12134Z0
    /* JADX INFO: renamed from: c */
    public final AbstractC12133Z mo13789c() {
        InterfaceC12091G0 interfaceC12091G0 = this.f36946a;
        return interfaceC12091G0 instanceof AbstractC12133Z ? ((AbstractC12133Z) interfaceC12091G0).newMutableInstance() : ((AbstractC12121T) interfaceC12091G0.newBuilderForType()).m13862c();
    }

    @Override // com.google.protobuf.InterfaceC12134Z0
    /* JADX INFO: renamed from: d */
    public final void mo13790d(Object obj, Object obj2) {
        AbstractC12137a1.m13882C(this.f36947b, obj, obj2);
        if (this.f36948c) {
            this.f36949d.getClass();
            C12110N c12110n = ((GeneratedMessageLite$ExtendableMessage) obj2).extensions;
            if (c12110n.f36962a.isEmpty()) {
                return;
            }
            ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable().m13851n(c12110n);
        }
    }

    @Override // com.google.protobuf.InterfaceC12134Z0
    /* JADX INFO: renamed from: e */
    public final void mo13791e(Object obj, C12211z0 c12211z0) {
        this.f36949d.getClass();
        Iterator itM13849l = ((GeneratedMessageLite$ExtendableMessage) obj).extensions.m13849l();
        while (itM13849l.hasNext()) {
            Map.Entry entry = (Map.Entry) itM13849l.next();
            C12127W c12127w = (C12127W) entry.getKey();
            if (c12127w.f36984Z.f36922Y != EnumC12104K1.MESSAGE || c12127w.f36985o0 || c12127w.f36986p0) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            Object value = entry.getValue();
            c12211z0.getClass();
            boolean z6 = value instanceof AbstractC12171m;
            int i10 = c12127w.f36983Y;
            AbstractC12195u abstractC12195u = (AbstractC12195u) c12211z0.f37131a;
            if (z6) {
                abstractC12195u.mo14105N0(i10, (AbstractC12171m) value);
            } else {
                abstractC12195u.mo14104M0(i10, (InterfaceC12091G0) value);
            }
        }
        this.f36947b.getClass();
        C12182p1 c12182p1 = ((AbstractC12133Z) obj).unknownFields;
        c12182p1.getClass();
        c12211z0.getClass();
        for (int i11 = 0; i11 < c12182p1.f37069a; i11++) {
            int i12 = c12182p1.f37070b[i11] >>> 3;
            Object obj2 = c12182p1.f37071c[i11];
            boolean z10 = obj2 instanceof AbstractC12171m;
            AbstractC12195u abstractC12195u2 = (AbstractC12195u) c12211z0.f37131a;
            if (z10) {
                abstractC12195u2.mo14105N0(i12, (AbstractC12171m) obj2);
            } else {
                abstractC12195u2.mo14104M0(i12, (InterfaceC12091G0) obj2);
            }
        }
    }

    @Override // com.google.protobuf.InterfaceC12134Z0
    /* JADX INFO: renamed from: f */
    public final int mo13792f(AbstractC12133Z abstractC12133Z) {
        this.f36947b.getClass();
        int iHashCode = abstractC12133Z.unknownFields.hashCode();
        if (!this.f36948c) {
            return iHashCode;
        }
        this.f36949d.getClass();
        return (iHashCode * 53) + ((GeneratedMessageLite$ExtendableMessage) abstractC12133Z).extensions.f36962a.hashCode();
    }

    @Override // com.google.protobuf.InterfaceC12134Z0
    /* JADX INFO: renamed from: g */
    public final int mo13793g(AbstractC12133Z abstractC12133Z) {
        this.f36947b.getClass();
        C12182p1 c12182p1 = abstractC12133Z.unknownFields;
        int i10 = c12182p1.f37072d;
        if (i10 == -1) {
            int iM14129c0 = 0;
            for (int i11 = 0; i11 < c12182p1.f37069a; i11++) {
                int i12 = c12182p1.f37070b[i11] >>> 3;
                iM14129c0 += AbstractC12195u.m14129c0(3, (AbstractC12171m) c12182p1.f37071c[i11]) + AbstractC12195u.m14147u0(2, i12) + (AbstractC12195u.m14146t0(1) * 2);
            }
            c12182p1.f37072d = iM14129c0;
            i10 = iM14129c0;
        }
        if (!this.f36948c) {
            return i10;
        }
        this.f36949d.getClass();
        return i10 + ((GeneratedMessageLite$ExtendableMessage) abstractC12133Z).extensions.m13845f();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cb A[EDGE_INSN: B:52:0x00cb->B:36:0x00cb BREAK  A[LOOP:1: B:18:0x0075->B:26:0x00a0], SYNTHETIC] */
    @Override // com.google.protobuf.InterfaceC12134Z0
    /* JADX INFO: renamed from: h */
    public final void mo13794h(Object obj, byte[] bArr, int i10, int i11, C0138o c0138o) throws C12181p0 {
        C12103K0 c12103k0 = this;
        AbstractC12133Z abstractC12133Z = (AbstractC12133Z) obj;
        C12182p1 c12182p1 = abstractC12133Z.unknownFields;
        if (c12182p1 == C12182p1.f37068f) {
            c12182p1 = new C12182p1();
            abstractC12133Z.unknownFields = c12182p1;
        }
        C12182p1 c12182p2 = c12182p1;
        C12110N c12110nEnsureExtensionsAreMutable = ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable();
        int iM13952J = i10;
        C12129X c12129xM13738a = null;
        while (iM13952J < i11) {
            int iM13955O = AbstractC12153g.m13955O(bArr, iM13952J, c0138o);
            int i12 = c0138o.f575Y;
            InterfaceC12091G0 interfaceC12091G0 = c12103k0.f36946a;
            C12090G c12090g = c12103k0.f36949d;
            int i13 = 2;
            C12087F c12087f = (C12087F) c0138o.f578p0;
            if (i12 == 11) {
                int i14 = 0;
                AbstractC12171m abstractC12171m = null;
                while (iM13955O < i11) {
                    iM13955O = AbstractC12153g.m13955O(bArr, iM13955O, c0138o);
                    int i15 = c0138o.f575Y;
                    int i16 = i15 >>> 3;
                    int i17 = i15 & 7;
                    if (i16 != i13) {
                        if (i16 == 3) {
                            if (c12129xM13738a != null) {
                                iM13955O = AbstractC12153g.m13983s(C12128W0.f36987c.m13868a(c12129xM13738a.f36992c.getClass()), bArr, iM13955O, i11, c0138o);
                                c12110nEnsureExtensionsAreMutable.m13853p(c12129xM13738a.f36993d, c0138o.f577o0);
                            } else if (i17 == 2) {
                                iM13955O = AbstractC12153g.m13970f(bArr, iM13955O, c0138o);
                                abstractC12171m = (AbstractC12171m) c0138o.f577o0;
                            } else if (i15 == 12) {
                                break;
                            } else {
                                iM13955O = AbstractC12153g.m13964Z(i15, bArr, iM13955O, i11, c0138o);
                            }
                        } else {
                            if (i15 == 12) {
                                break;
                                break;
                            }
                            iM13955O = AbstractC12153g.m13964Z(i15, bArr, iM13955O, i11, c0138o);
                        }
                    } else if (i17 == 0) {
                        iM13955O = AbstractC12153g.m13955O(bArr, iM13955O, c0138o);
                        i14 = c0138o.f575Y;
                        c12090g.getClass();
                        c12129xM13738a = c12087f.m13738a(i14, interfaceC12091G0);
                    } else {
                        if (i15 == 12) {
                            break;
                            break;
                        }
                        iM13955O = AbstractC12153g.m13964Z(i15, bArr, iM13955O, i11, c0138o);
                    }
                    i13 = 2;
                }
                if (abstractC12171m != null) {
                    c12182p2.m14072f((i14 << 3) | 2, abstractC12171m);
                }
                c12103k0 = this;
                iM13952J = iM13955O;
            } else if ((i12 & 7) == 2) {
                c12090g.getClass();
                C12129X c12129xM13738a2 = c12087f.m13738a(i12 >>> 3, interfaceC12091G0);
                if (c12129xM13738a2 != null) {
                    iM13952J = AbstractC12153g.m13983s(C12128W0.f36987c.m13868a(c12129xM13738a2.f36992c.getClass()), bArr, iM13955O, i11, c0138o);
                    c12110nEnsureExtensionsAreMutable.m13853p(c12129xM13738a2.f36993d, c0138o.f577o0);
                } else {
                    iM13952J = AbstractC12153g.m13952J(i12, bArr, iM13955O, i11, c12182p2, c0138o);
                }
                c12129xM13738a = c12129xM13738a2;
            } else {
                iM13952J = AbstractC12153g.m13964Z(i12, bArr, iM13955O, i11, c0138o);
            }
        }
        if (iM13952J != i11) {
            throw C12181p0.m14065f();
        }
    }

    @Override // com.google.protobuf.InterfaceC12134Z0
    /* JADX INFO: renamed from: i */
    public final boolean mo13795i(AbstractC12133Z abstractC12133Z, Object obj) {
        this.f36947b.getClass();
        if (!abstractC12133Z.unknownFields.equals(((AbstractC12133Z) obj).unknownFields)) {
            return false;
        }
        if (!this.f36948c) {
            return true;
        }
        this.f36949d.getClass();
        return ((GeneratedMessageLite$ExtendableMessage) abstractC12133Z).extensions.equals(((GeneratedMessageLite$ExtendableMessage) obj).extensions);
    }

    @Override // com.google.protobuf.InterfaceC12134Z0
    /* JADX INFO: renamed from: j */
    public final void mo13796j(Object obj, C6277D c6277d, C12087F c12087f) {
        C12185q1 c12185q1 = this.f36947b;
        c12185q1.getClass();
        C12182p1 c12182p1M14080a = C12185q1.m14080a(obj);
        C12090G c12090g = this.f36949d;
        c12090g.getClass();
        C12110N c12110nEnsureExtensionsAreMutable = ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable();
        while (c6277d.m6794b() != Integer.MAX_VALUE && m13808k(c6277d, c12087f, c12090g, c12110nEnsureExtensionsAreMutable, c12185q1, c12182p1M14080a)) {
            try {
            } finally {
                ((AbstractC12133Z) obj).unknownFields = c12182p1M14080a;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m13808k(C6277D c6277d, C12087F c12087f, C12090G c12090g, C12110N c12110n, C12185q1 c12185q1, C12182p1 c12182p1) throws C12181p0, C11064z {
        int i10 = c6277d.f20382b;
        InterfaceC12091G0 interfaceC12091G0 = this.f36946a;
        if (i10 != 11) {
            if ((i10 & 7) != 2) {
                return c6277d.m6833u0();
            }
            c12090g.getClass();
            C12129X c12129xM13738a = c12087f.m13738a(i10 >>> 3, interfaceC12091G0);
            if (c12129xM13738a == null) {
                c12185q1.getClass();
                return C12185q1.m14082c(c12182p1, c6277d);
            }
            c12110n.m13853p(c12129xM13738a.f36993d, c6277d.m6782Q(c12129xM13738a.f36992c.getClass(), c12087f));
            return true;
        }
        C12129X c12129xM13738a2 = null;
        int iMo14020F = 0;
        AbstractC12171m abstractC12171mM6820o = null;
        while (c6277d.m6794b() != Integer.MAX_VALUE) {
            int i11 = c6277d.f20382b;
            if (i11 == 16) {
                c6277d.m6829s0(0);
                iMo14020F = ((AbstractC12186r) c6277d.f20385e).mo14020F();
                c12090g.getClass();
                c12129xM13738a2 = c12087f.m13738a(iMo14020F, interfaceC12091G0);
            } else if (i11 == 26) {
                if (c12129xM13738a2 != null) {
                    c12090g.getClass();
                    c12110n.m13853p(c12129xM13738a2.f36993d, c6277d.m6782Q(c12129xM13738a2.f36992c.getClass(), c12087f));
                } else {
                    abstractC12171mM6820o = c6277d.m6820o();
                }
            } else if (!c6277d.m6833u0()) {
                break;
            }
        }
        if (c6277d.f20382b != 12) {
            throw new C12181p0("Protocol message end-group tag did not match expected tag.");
        }
        if (abstractC12171mM6820o != null) {
            if (c12129xM13738a2 != null) {
                c12090g.getClass();
                InterfaceC12088F0 interfaceC12088F0NewBuilderForType = c12129xM13738a2.f36992c.newBuilderForType();
                AbstractC12186r abstractC12186rMo14004s = abstractC12171mM6820o.mo14004s();
                AbstractC12121T abstractC12121T = (AbstractC12121T) interfaceC12088F0NewBuilderForType;
                abstractC12121T.m13864e(abstractC12186rMo14004s, c12087f);
                c12110n.m13853p(c12129xM13738a2.f36993d, abstractC12121T.m13862c());
                abstractC12186rMo14004s.mo14029a(0);
            } else {
                c12185q1.getClass();
                c12182p1.m14072f((iMo14020F << 3) | 2, abstractC12171mM6820o);
            }
        }
        return true;
    }
}
