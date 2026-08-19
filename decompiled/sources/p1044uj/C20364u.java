package p1044uj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.shared.p687ui.Pi2NavigationBar;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1440o;
import p1065vj.C20631c;
import p571X9.AbstractC9123E2;

/* JADX INFO: renamed from: uj.u */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C20364u extends AbstractC16541i implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public static final C20364u f64381Y = new C20364u(3, C20631c.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentReviewBinding;", 0);

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p10 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        AbstractC16544l.m18094g(p10, "p0");
        View viewInflate = p10.inflate(R.layout.pi2_document_review, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i10 = R.id.body;
        TextView textView = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.body);
        if (textView != null) {
            i10 = R.id.bottom_guideline;
            if (((Guideline) AbstractC9123E2.m9654b(viewInflate, R.id.bottom_guideline)) != null) {
                i10 = R.id.disclaimer;
                TextView textView2 = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.disclaimer);
                if (textView2 != null) {
                    i10 = R.id.left_guideline;
                    if (((Guideline) AbstractC9123E2.m9654b(viewInflate, R.id.left_guideline)) != null) {
                        i10 = R.id.navigation_bar;
                        Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) AbstractC9123E2.m9654b(viewInflate, R.id.navigation_bar);
                        if (pi2NavigationBar != null) {
                            i10 = R.id.review_item_list;
                            RecyclerView recyclerView = (RecyclerView) AbstractC9123E2.m9654b(viewInflate, R.id.review_item_list);
                            if (recyclerView != null) {
                                i10 = R.id.right_guideline;
                                if (((Guideline) AbstractC9123E2.m9654b(viewInflate, R.id.right_guideline)) != null) {
                                    i10 = R.id.submit_button;
                                    Button button = (Button) AbstractC9123E2.m9654b(viewInflate, R.id.submit_button);
                                    if (button != null) {
                                        i10 = R.id.title;
                                        TextView textView3 = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.title);
                                        if (textView3 != null) {
                                            return new C20631c((CoordinatorLayout) viewInflate, textView, textView2, pi2NavigationBar, recyclerView, button, textView3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
