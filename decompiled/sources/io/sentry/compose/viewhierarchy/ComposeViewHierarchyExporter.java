package io.sentry.compose.viewhierarchy;

import io.sentry.InterfaceC15127H;
import io.sentry.protocol.C15427G;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p1095x1.C21060N;
import p1140z1.C21658D;
import p156G1.C2974u;
import p156G1.InterfaceC2964k;
import p392Q0.C6546d;
import p635a1.InterfaceC10459q;
import p658b5.C11234e;
import p759g1.C13801c;

/* JADX INFO: loaded from: classes3.dex */
public final class ComposeViewHierarchyExporter {

    /* JADX INFO: renamed from: a */
    public final InterfaceC15127H f47898a;

    /* JADX INFO: renamed from: b */
    public volatile C11234e f47899b;

    public ComposeViewHierarchyExporter(InterfaceC15127H interfaceC15127H) {
        this.f47898a = interfaceC15127H;
    }

    /* JADX INFO: renamed from: a */
    public static void m16567a(C11234e c11234e, C15427G c15427g, C21658D c21658d, C21658D c21658d2) {
        C13801c c13801cM12524z;
        if (c21658d2.m22025W()) {
            C15427G c15427g2 = new C15427G();
            Iterator it = c21658d2.m22007E().iterator();
            while (it.hasNext()) {
                InterfaceC10459q interfaceC10459q = ((C21060N) it.next()).f66972a;
                if (interfaceC10459q instanceof InterfaceC2964k) {
                    for (Map.Entry entry : ((InterfaceC2964k) interfaceC10459q).mo3788v0()) {
                        String str = ((C2974u) entry.getKey()).f8943a;
                        if ("SentryTag".equals(str) || "TestTag".equals(str)) {
                            if (entry.getValue() instanceof String) {
                                c15427g2.f48077p0 = (String) entry.getValue();
                            }
                        }
                    }
                }
            }
            int iM22059s = c21658d2.m22059s();
            int iM22011I = c21658d2.m22011I();
            c15427g2.f48079r0 = Double.valueOf(iM22059s);
            c15427g2.f48078q0 = Double.valueOf(iM22011I);
            C13801c c13801cM12524z2 = c11234e.m12524z(c21658d2);
            if (c13801cM12524z2 != null) {
                double d10 = c13801cM12524z2.f43586a;
                double d11 = c13801cM12524z2.f43587b;
                if (c21658d != null && (c13801cM12524z = c11234e.m12524z(c21658d)) != null) {
                    d10 -= (double) c13801cM12524z.f43586a;
                    d11 -= (double) c13801cM12524z.f43587b;
                }
                c15427g2.f48080s0 = Double.valueOf(d10);
                c15427g2.f48081t0 = Double.valueOf(d11);
            }
            String str2 = c15427g2.f48077p0;
            if (str2 != null) {
                c15427g2.f48075Z = str2;
            } else {
                c15427g2.f48075Z = "@Composable";
            }
            if (c15427g.f48084w0 == null) {
                c15427g.f48084w0 = new ArrayList();
            }
            c15427g.f48084w0.add(c15427g2);
            C6546d c6546dM22013K = c21658d2.m22013K();
            int i10 = c6546dM22013K.f21184o0;
            for (int i11 = 0; i11 < i10; i11++) {
                m16567a(c11234e, c15427g2, c21658d2, (C21658D) c6546dM22013K.f21182Y[i11]);
            }
        }
    }
}
