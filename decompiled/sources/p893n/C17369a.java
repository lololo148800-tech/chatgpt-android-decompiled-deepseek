package p893n;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: n.a */
/* JADX INFO: loaded from: classes.dex */
public final class C17369a implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C17372d f55437Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C17370b f55438Z;

    public C17369a(C17370b c17370b, C17372d c17372d) {
        this.f55438Z = c17370b;
        this.f55437Y = c17372d;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        C17370b c17370b = this.f55438Z;
        DialogInterface.OnClickListener onClickListener = c17370b.f55446h;
        C17372d c17372d = this.f55437Y;
        onClickListener.onClick(c17372d.f55454b, i10);
        if (c17370b.f55447i) {
            return;
        }
        c17372d.f55454b.dismiss();
    }
}
