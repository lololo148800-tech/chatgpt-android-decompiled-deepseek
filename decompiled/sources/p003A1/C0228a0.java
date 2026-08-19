package p003A1;

import android.view.PointerIcon;
import android.view.View;
import kotlin.jvm.internal.AbstractC16544l;
import p1014t1.C19724a;
import p1014t1.InterfaceC19734k;

/* JADX INFO: renamed from: A1.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0228a0 {

    /* JADX INFO: renamed from: a */
    public static final C0228a0 f857a = new C0228a0();

    /* JADX INFO: renamed from: a */
    public final void m731a(View view, InterfaceC19734k interfaceC19734k) {
        PointerIcon systemIcon = interfaceC19734k instanceof C19724a ? PointerIcon.getSystemIcon(view.getContext(), ((C19724a) interfaceC19734k).f62446b) : PointerIcon.getSystemIcon(view.getContext(), 1000);
        if (AbstractC16544l.m18089b(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
