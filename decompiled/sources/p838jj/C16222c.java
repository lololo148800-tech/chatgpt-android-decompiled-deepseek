package p838jj;

import android.content.Context;
import android.view.ViewGroup;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p003A1.C0295v;
import p049Bm.InterfaceC1441p;
import p544W9.AbstractC8718u;
import p769gj.C14183y;

/* JADX INFO: renamed from: jj.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C16222c extends AbstractC16546n implements InterfaceC1441p {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f50335Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16222c(int i10) {
        super(4);
        this.f50335Y = i10;
    }

    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) {
        C16224e initialRendering = (C16224e) obj;
        C14183y initialEnv = (C14183y) obj2;
        Context context = (Context) obj3;
        AbstractC16544l.m18094g(initialRendering, "initialRendering");
        AbstractC16544l.m18094g(initialEnv, "initialEnv");
        AbstractC16544l.m18094g(context, "context");
        C16223d c16223d = new C16223d(context, this.f50335Y);
        c16223d.setId(R.id.workflow_alert_container);
        c16223d.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        AbstractC8718u.m9432a(c16223d, initialRendering, initialEnv, new C0295v(2, c16223d, C16223d.class, "update", "update(Lcom/squareup/workflow1/ui/modal/HasModals;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0, 11));
        return c16223d;
    }
}
