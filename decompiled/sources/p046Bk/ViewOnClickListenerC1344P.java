package p046Bk;

import android.view.View;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import pk.C18496a;

/* JADX INFO: renamed from: Bk.P */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC1344P implements View.OnClickListener {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3550Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f3551Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C18496a f3552o0;

    public /* synthetic */ ViewOnClickListenerC1344P(InterfaceC1436k interfaceC1436k, C18496a c18496a, int i10) {
        this.f3550Y = i10;
        this.f3551Z = interfaceC1436k;
        this.f3552o0 = c18496a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3550Y) {
            case 0:
                InterfaceC1436k action = this.f3551Z;
                AbstractC16544l.m18094g(action, "$action");
                C18496a componentView = this.f3552o0;
                AbstractC16544l.m18094g(componentView, "$componentView");
                action.invoke(componentView.f58958a);
                break;
            default:
                InterfaceC1436k action2 = this.f3551Z;
                AbstractC16544l.m18094g(action2, "$action");
                C18496a componentView2 = this.f3552o0;
                AbstractC16544l.m18094g(componentView2, "$componentView");
                action2.invoke(componentView2.f58958a);
                break;
        }
    }
}
