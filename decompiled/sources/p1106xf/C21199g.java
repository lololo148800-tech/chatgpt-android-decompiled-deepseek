package p1106xf;

import android.content.Context;
import android.content.ContextWrapper;
import p893n.AbstractActivityC17375g;

/* JADX INFO: renamed from: xf.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C21199g extends ContextWrapper {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractActivityC17375g f67403a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21199g(AbstractActivityC17375g abstractActivityC17375g, Context context) {
        super(context);
        this.f67403a = abstractActivityC17375g;
    }

    @Override // android.content.ContextWrapper
    public final Context getBaseContext() {
        return this.f67403a;
    }
}
