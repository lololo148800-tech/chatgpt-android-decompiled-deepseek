package com.google.protobuf;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p370P0.C6277D;

/* JADX INFO: renamed from: com.google.protobuf.T */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12121T implements InterfaceC12088F0 {

    /* JADX INFO: renamed from: Y */
    public final AbstractC12133Z f36980Y;

    /* JADX INFO: renamed from: Z */
    public AbstractC12133Z f36981Z;

    public AbstractC12121T(AbstractC12133Z abstractC12133Z) {
        this.f36980Y = abstractC12133Z;
        if (abstractC12133Z.isMutable()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f36981Z = abstractC12133Z.newMutableInstance();
    }

    /* JADX INFO: renamed from: a */
    public static void m13859a(Iterable iterable, List list) {
        Charset charset = AbstractC12175n0.f37050a;
        iterable.getClass();
        if (iterable instanceof InterfaceC12190s0) {
            List underlyingElements = ((InterfaceC12190s0) iterable).getUnderlyingElements();
            InterfaceC12190s0 interfaceC12190s0 = (InterfaceC12190s0) list;
            int size = list.size();
            for (Object obj : underlyingElements) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC12190s0.size() - size) + " is null.";
                    for (int size2 = interfaceC12190s0.size() - 1; size2 >= size; size2--) {
                        interfaceC12190s0.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC12171m) {
                    interfaceC12190s0.mo14091k((AbstractC12171m) obj);
                } else {
                    interfaceC12190s0.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof InterfaceC12126V0) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size3 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size3) + " is null.";
                for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                    list.remove(size4);
                }
                throw new NullPointerException(str2);
            }
            list.add(obj2);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m13860g(Object obj, Object obj2) {
        C12128W0.f36987c.m13869b(obj).mo13790d(obj, obj2);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC12133Z m13861b() {
        AbstractC12133Z abstractC12133ZM13862c = m13862c();
        if (abstractC12133ZM13862c.isInitialized()) {
            return abstractC12133ZM13862c;
        }
        throw new C12179o1();
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC12133Z m13862c() {
        if (!this.f36981Z.isMutable()) {
            return this.f36981Z;
        }
        this.f36981Z.makeImmutable();
        return this.f36981Z;
    }

    public final Object clone() {
        AbstractC12121T abstractC12121TNewBuilderForType = this.f36980Y.newBuilderForType();
        abstractC12121TNewBuilderForType.f36981Z = m13862c();
        return abstractC12121TNewBuilderForType;
    }

    /* JADX INFO: renamed from: d */
    public final void m13863d() {
        if (this.f36981Z.isMutable()) {
            return;
        }
        AbstractC12133Z abstractC12133ZNewMutableInstance = this.f36980Y.newMutableInstance();
        m13860g(abstractC12133ZNewMutableInstance, this.f36981Z);
        this.f36981Z = abstractC12133ZNewMutableInstance;
    }

    /* JADX INFO: renamed from: e */
    public final void m13864e(AbstractC12186r abstractC12186r, C12087F c12087f) {
        m13863d();
        try {
            InterfaceC12134Z0 interfaceC12134Z0M13869b = C12128W0.f36987c.m13869b(this.f36981Z);
            AbstractC12133Z abstractC12133Z = this.f36981Z;
            C6277D c6277d = abstractC12186r.f37095b;
            if (c6277d == null) {
                c6277d = new C6277D(abstractC12186r);
            }
            interfaceC12134Z0M13869b.mo13796j(abstractC12133Z, c6277d, c12087f);
        } catch (RuntimeException e10) {
            if (!(e10.getCause() instanceof IOException)) {
                throw e10;
            }
            throw ((IOException) e10.getCause());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m13865f(AbstractC12133Z abstractC12133Z) {
        if (this.f36980Y.equals(abstractC12133Z)) {
            return;
        }
        m13863d();
        m13860g(this.f36981Z, abstractC12133Z);
    }

    @Override // com.google.protobuf.InterfaceC12094H0
    public final boolean isInitialized() {
        return AbstractC12133Z.isInitialized(this.f36981Z, false);
    }
}
