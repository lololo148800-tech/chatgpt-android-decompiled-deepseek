package p387Pl;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.OrientationEventListener;
import mm.C17309l;
import p1160zp.AbstractC22225a;
import p533Vl.AbstractC8396h;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p867l8.C16831c;

/* JADX INFO: renamed from: Pl.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C6492l extends OrientationEventListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6494n f21059a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6492l(Context context, C6494n c6494n) {
        super(context);
        this.f21059a = c6494n;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i10) {
        C6494n c6494n = this.f21059a;
        if (c6494n.m7052d()) {
            disable();
            return;
        }
        Display defaultDisplay = c6494n.f21069z.getDefaultDisplay();
        DisplayMetrics displayMetrics = c6494n.f21068y;
        defaultDisplay.getRealMetrics(displayMetrics);
        int i11 = displayMetrics.widthPixels;
        int i12 = displayMetrics.heightPixels;
        if (i11 == c6494n.f21066w && i12 == c6494n.f21067x) {
            return;
        }
        c6494n.f21066w = i11;
        c6494n.f21067x = i12;
        C17309l c17309lM7060p = c6494n.m7060p(i11, i12);
        try {
            c6494n.f21089n.changeCaptureFormat(((Number) c17309lM7060p.f55136Y).intValue(), ((Number) c17309lM7060p.f55137Z).intValue(), c6494n.m7065l().f21100d.f21001c);
        } catch (Exception unused) {
            C8395g c8395g = AbstractC8396h.Companion;
            EnumC8397i enumC8397i = EnumC8397i.f26119p0;
            AbstractC8396h.Companion.getClass();
            if (enumC8397i.compareTo(AbstractC8396h.f26115a) < 0 || AbstractC22225a.m22419a() <= 0) {
                return;
            }
            AbstractC22225a.f70470a.getClass();
            C16831c.m18571j(new Object[0]);
        }
    }
}
