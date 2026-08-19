package io.sentry.compose.gestures;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.view.View;
import androidx.compose.p650ui.node.Owner;
import io.sentry.C15358g1;
import io.sentry.InterfaceC15127H;
import io.sentry.internal.gestures.C15387c;
import io.sentry.internal.gestures.EnumC15386b;
import io.sentry.internal.gestures.InterfaceC15385a;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import p1095x1.C21060N;
import p1140z1.C21658D;
import p156G1.C2974u;
import p156G1.InterfaceC2964k;
import p279L1.VOxZ.sVoFrD;
import p635a1.InterfaceC10459q;
import p658b5.C11234e;
import p759g1.C13801c;

/* JADX INFO: loaded from: classes3.dex */
public final class ComposeGestureTargetLocator implements InterfaceC15385a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC15127H f47896a;

    /* JADX INFO: renamed from: b */
    public volatile C11234e f47897b;

    public ComposeGestureTargetLocator(InterfaceC15127H interfaceC15127H) {
        this.f47896a = interfaceC15127H;
        C15358g1.m16578n().m16579d("ComposeUserInteraction");
        C15358g1.m16578n().m16580f("maven:io.sentry:sentry-compose");
    }

    /* JADX WARN: Code duplicated, block: B:83:0x0142 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:84:0x0143  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.internal.gestures.InterfaceC15385a
    /* JADX INFO: renamed from: a */
    public final C15387c mo16426a(View view, float f10, float f11, EnumC15386b enumC15386b) {
        String str;
        C13801c c13801cM12524z;
        if (this.f47897b == null) {
            synchronized (this) {
                try {
                    if (this.f47897b == null) {
                        this.f47897b = new C11234e(this.f47896a);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (!(view instanceof Owner)) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(((Owner) view).getRoot());
        String str2 = null;
        String str3 = null;
        while (!linkedList.isEmpty()) {
            C21658D c21658d = (C21658D) linkedList.poll();
            if (c21658d != null) {
                if (c21658d.m22025W() && (c13801cM12524z = this.f47897b.m12524z(c21658d)) != null && f10 >= c13801cM12524z.f43586a && f10 <= c13801cM12524z.f43588c && f11 >= c13801cM12524z.f43587b && f11 <= c13801cM12524z.f43589d) {
                    Iterator it = c21658d.m22007E().iterator();
                    boolean z6 = false;
                    boolean z10 = false;
                    while (it.hasNext()) {
                        InterfaceC10459q interfaceC10459q = ((C21060N) it.next()).f66972a;
                        if (interfaceC10459q instanceof InterfaceC2964k) {
                            for (Map.Entry entry : ((InterfaceC2964k) interfaceC10459q).mo3788v0()) {
                                String str4 = ((C2974u) entry.getKey()).f8943a;
                                if ("ScrollBy".equals(str4)) {
                                    z10 = true;
                                } else if ("OnClick".equals(str4)) {
                                    z6 = true;
                                } else if ("SentryTag".equals(str4) || "TestTag".equals(str4)) {
                                    if (entry.getValue() instanceof String) {
                                        str3 = (String) entry.getValue();
                                    }
                                }
                            }
                        } else {
                            String canonicalName = interfaceC10459q.getClass().getCanonicalName();
                            if ("androidx.compose.foundation.ClickableElement".equals(canonicalName) || "androidx.compose.foundation.CombinedClickableElement".equals(canonicalName)) {
                                z6 = true;
                            } else if ("androidx.compose.foundation.ScrollingLayoutElement".equals(canonicalName)) {
                                z10 = true;
                            } else if (sVoFrD.FIG.equals(canonicalName)) {
                                try {
                                    Field declaredField = interfaceC10459q.getClass().getDeclaredField(ParameterNames.TAG);
                                    declaredField.setAccessible(true);
                                    Object obj = declaredField.get(interfaceC10459q);
                                    if (obj instanceof String) {
                                        str3 = (String) obj;
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                        }
                    }
                    if (z6 && enumC15386b == EnumC15386b.CLICKABLE) {
                        str2 = str3;
                    }
                    if (z10 && enumC15386b == EnumC15386b.SCROLLABLE) {
                        str = str3;
                        if (str == null) {
                            return null;
                        }
                        return new C15387c(null, null, null, str, "jetpack_compose");
                    }
                }
                linkedList.addAll(c21658d.m22013K().m7103h());
            }
        }
        str = str2;
        if (str == null) {
            return null;
        }
        return new C15387c(null, null, null, str, "jetpack_compose");
    }
}
