package p931ok;

import android.content.Context;
import android.view.ViewGroup;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p003A1.C0295v;
import p049Bm.InterfaceC1441p;
import p544W9.AbstractC8718u;
import p769gj.C14183y;
import p861l1.xapn.suYVq;

/* JADX INFO: renamed from: ok.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C18227h extends AbstractC16546n implements InterfaceC1441p {

    /* JADX INFO: renamed from: Y */
    public static final C18227h f58079Y = new C18227h(4);

    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) {
        C18226g initialRendering = (C18226g) obj;
        C14183y initialEnv = (C14183y) obj2;
        Context context = (Context) obj3;
        AbstractC16544l.m18094g(initialRendering, "initialRendering");
        AbstractC16544l.m18094g(initialEnv, "initialEnv");
        AbstractC16544l.m18094g(context, suYVq.gHulqMnz);
        C18230k c18230k = new C18230k(context);
        c18230k.setId(R.id.pi2_back_stack_screen_runner);
        c18230k.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        AbstractC8718u.m9432a(c18230k, initialRendering, initialEnv, new C0295v(2, c18230k, C18230k.class, "update", "update(Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransition;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0, 12));
        return c18230k;
    }
}
