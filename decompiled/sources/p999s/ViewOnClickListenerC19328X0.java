package p999s;

import android.content.Context;
import android.view.View;
import android.view.Window;
import p976r.C18803a;

/* JADX INFO: renamed from: s.X0 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC19328X0 implements View.OnClickListener {

    /* JADX INFO: renamed from: Y */
    public final C18803a f61214Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19330Y0 f61215Z;

    public ViewOnClickListenerC19328X0(C19330Y0 c19330y0) {
        this.f61215Z = c19330y0;
        Context context = c19330y0.f61223a.getContext();
        CharSequence charSequence = c19330y0.f61230h;
        C18803a c18803a = new C18803a();
        c18803a.f59786e = 4096;
        c18803a.f59788g = 4096;
        c18803a.f59793l = null;
        c18803a.f59794m = null;
        c18803a.f59795n = false;
        c18803a.f59796o = false;
        c18803a.f59797p = 16;
        c18803a.f59790i = context;
        c18803a.f59782a = charSequence;
        this.f61214Y = c18803a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C19330Y0 c19330y0 = this.f61215Z;
        Window.Callback callback = c19330y0.f61233k;
        if (callback == null || !c19330y0.f61234l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f61214Y);
    }
}
