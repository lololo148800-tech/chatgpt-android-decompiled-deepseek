package p739f3;

import android.widget.RemoteViews;
import kotlin.jvm.internal.AbstractC16544l;
import p108E2.AbstractC2251j;
import p672c3.C11571E0;
import p774h1.AbstractC14334L;
import p884m3.C17150i;
import p884m3.InterfaceC17142a;

/* JADX INFO: renamed from: f3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C13530a {

    /* JADX INFO: renamed from: a */
    public static final C13530a f42822a = new C13530a();

    /* JADX INFO: renamed from: a */
    public final void m15084a(C11571E0 c11571e0, RemoteViews remoteViews, InterfaceC17142a interfaceC17142a, int i10) {
        if (interfaceC17142a instanceof C17150i) {
            int i11 = ((C17150i) interfaceC17142a).f54819a;
            AbstractC16544l.m18094g(remoteViews, "<this>");
            AbstractC2251j.m3284d(remoteViews, i10, "setColorFilter", i11);
        } else {
            int iM15617F = AbstractC14334L.m15617F(interfaceC17142a.mo18905a(c11571e0.f34973a));
            AbstractC16544l.m18094g(remoteViews, "<this>");
            remoteViews.setInt(i10, "setColorFilter", iM15617F);
        }
    }
}
