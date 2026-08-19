package me.saket.telephoto.zoomable;

import androidx.compose.foundation.AbstractC10838f;
import androidx.compose.p650ui.graphics.AbstractC10864a;
import androidx.compose.p650ui.layout.AbstractC10868a;
import kotlin.jvm.internal.AbstractC16544l;
import me.saket.telephoto.zoomable.internal.HardwareShortcutsElement;
import p349O0.C6002f0;
import p523V9.AbstractC8079e5;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p858ko.C16482A;
import p858ko.C16484C;
import p858ko.C16500c;
import p858ko.C16510m;
import p858ko.C16518u;

/* JADX INFO: renamed from: me.saket.telephoto.zoomable.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC17239a {
    /* JADX INFO: renamed from: a */
    public static InterfaceC10459q m18968a(InterfaceC10459q interfaceC10459q, C16484C c16484c) {
        C16500c c16500c = new C16500c(null);
        AbstractC16544l.m18094g(interfaceC10459q, "<this>");
        C10456n c10456n = C10456n.f30959Y;
        InterfaceC10459q interfaceC10459qMo428M = AbstractC10868a.m11319e(interfaceC10459q.mo428M(AbstractC8079e5.m8502b(c10456n)), new C16482A(c16484c, 2)).mo428M(new ZoomableElement(null, null, c16500c, c16484c, true));
        C6002f0 c6002f0 = c16484c.f51140g;
        if (((C16510m) c6002f0.getValue()).f51209a) {
            interfaceC10459qMo428M = interfaceC10459qMo428M.mo428M(AbstractC10838f.m11213a(new HardwareShortcutsElement(c16484c, (C16510m) c6002f0.getValue()), true, null));
        }
        return ((Boolean) c16484c.f51136c.getValue()).booleanValue() ? interfaceC10459qMo428M.mo428M(AbstractC10864a.m11305a(c10456n, new C16482A(new C16518u(c16484c, 5), 1))) : interfaceC10459qMo428M;
    }
}
