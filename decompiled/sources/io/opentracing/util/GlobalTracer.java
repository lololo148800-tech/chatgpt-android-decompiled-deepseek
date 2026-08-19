package io.opentracing.util;

import hm.InterfaceC14536a;
import hm.InterfaceC14537b;
import hm.InterfaceC14538c;
import hm.InterfaceC14539d;
import hm.InterfaceC14540e;
import im.C15043e;
import java.io.IOException;
import jm.C16270a;
import jm.InterfaceC16271b;
import p1021t8.C19813d;
import p277L.CallableC4829b;

/* JADX INFO: loaded from: classes3.dex */
public final class GlobalTracer implements InterfaceC14540e {

    /* JADX INFO: renamed from: Y */
    public static final GlobalTracer f46995Y = new GlobalTracer();

    /* JADX INFO: renamed from: Z */
    public static volatile InterfaceC14540e f46996Z = C15043e.f46762Y;

    /* JADX INFO: renamed from: o0 */
    public static volatile boolean f46997o0 = false;

    /* JADX INFO: renamed from: a */
    public static synchronized void m16232a(C19813d c19813d) {
        m16233e(new CallableC4829b(c19813d, 7));
    }

    /* JADX INFO: renamed from: e */
    public static synchronized boolean m16233e(CallableC4829b callableC4829b) {
        if (isRegistered()) {
            return false;
        }
        try {
            try {
                f46996Z = (C19813d) callableC4829b.f15724b;
                f46997o0 = true;
                return true;
            } catch (Exception e10) {
                throw new IllegalStateException("Exception obtaining tracer from provider: " + e10.getMessage(), e10);
            }
        } catch (RuntimeException e11) {
            throw e11;
        }
    }

    public static boolean isRegistered() {
        return f46997o0;
    }

    @Override // hm.InterfaceC14540e
    /* JADX INFO: renamed from: J */
    public final InterfaceC14539d mo16040J(String str) {
        return f46996Z.mo16040J(str);
    }

    @Override // hm.InterfaceC14540e
    /* JADX INFO: renamed from: R0 */
    public final InterfaceC14536a mo3850R0(InterfaceC14537b interfaceC14537b) {
        return f46996Z.mo3850R0(interfaceC14537b);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        f46996Z.close();
    }

    @Override // hm.InterfaceC14540e
    /* JADX INFO: renamed from: m0 */
    public final InterfaceC14538c mo3853m0(C16270a c16270a) {
        return f46996Z.mo3853m0(c16270a);
    }

    public final String toString() {
        return "GlobalTracer{" + f46996Z + '}';
    }

    @Override // hm.InterfaceC14540e
    /* JADX INFO: renamed from: y */
    public final void mo3854y(InterfaceC14538c interfaceC14538c, InterfaceC16271b interfaceC16271b) {
        f46996Z.mo3854y(interfaceC14538c, interfaceC16271b);
    }
}
