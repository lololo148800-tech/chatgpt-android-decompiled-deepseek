package pk;

import android.view.View;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: pk.g */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC18502g implements View.OnClickListener {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC1436k f58963Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18496a f58964Z;

    public ViewOnClickListenerC18502g(InterfaceC1436k interfaceC1436k, C18496a c18496a) {
        this.f58963Y = interfaceC1436k;
        this.f58964Z = c18496a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f58963Y.invoke(this.f58964Z.f58958a);
    }
}
