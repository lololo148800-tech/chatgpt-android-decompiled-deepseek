package p813ij;

import android.content.Context;
import android.view.ViewGroup;
import com.openai.chatgpt.R;
import com.squareup.workflow1.p685ui.backstack.BackStackContainer;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p003A1.C0295v;
import p049Bm.InterfaceC1441p;
import p544W9.AbstractC8718u;
import p769gj.C14183y;

/* JADX INFO: renamed from: ij.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C15019c extends AbstractC16546n implements InterfaceC1441p {

    /* JADX INFO: renamed from: Y */
    public static final C15019c f46717Y = new C15019c(4);

    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) {
        C15022f initialRendering = (C15022f) obj;
        C14183y initialEnv = (C14183y) obj2;
        Context context = (Context) obj3;
        AbstractC16544l.m18094g(initialRendering, "initialRendering");
        AbstractC16544l.m18094g(initialEnv, "initialEnv");
        AbstractC16544l.m18094g(context, "context");
        BackStackContainer backStackContainer = new BackStackContainer(context, null, 14);
        backStackContainer.setId(R.id.workflow_back_stack_container);
        backStackContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        AbstractC8718u.m9432a(backStackContainer, initialRendering, initialEnv, new C0295v(2, backStackContainer, BackStackContainer.class, "update", "update(Lcom/squareup/workflow1/ui/backstack/BackStackScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0, 10));
        return backStackContainer;
    }
}
