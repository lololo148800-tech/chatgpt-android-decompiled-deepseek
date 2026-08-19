package p1044uj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1440o;
import p1065vj.C20629a;
import p571X9.AbstractC9123E2;

/* JADX INFO: renamed from: uj.o */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C20352o extends AbstractC16541i implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public static final C20352o f64352Y = new C20352o(3, C20629a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentLoadingBinding;", 0);

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p10 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        AbstractC16544l.m18094g(p10, "p0");
        View viewInflate = p10.inflate(R.layout.pi2_document_loading, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i10 = R.id.animation_container;
        ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC9123E2.m9654b(viewInflate, R.id.animation_container);
        if (constraintLayout != null) {
            i10 = R.id.body;
            TextView textView = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.body);
            if (textView != null) {
                i10 = R.id.loading_animation;
                ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) AbstractC9123E2.m9654b(viewInflate, R.id.loading_animation);
                if (themeableLottieAnimationView != null) {
                    i10 = R.id.title;
                    TextView textView2 = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.title);
                    if (textView2 != null) {
                        return new C20629a(textView, textView2, (ConstraintLayout) viewInflate, constraintLayout, themeableLottieAnimationView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
