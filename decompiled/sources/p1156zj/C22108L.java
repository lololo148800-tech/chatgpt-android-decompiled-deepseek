package p1156zj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.shared.p687ui.Pi2NavigationBar;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1440o;
import p099Dj.C2068f;
import p571X9.AbstractC9123E2;

/* JADX INFO: renamed from: zj.L */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C22108L extends AbstractC16541i implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public static final C22108L f69888Y = new C22108L(3, C2068f.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidInstructionsBinding;", 0);

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p10 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        AbstractC16544l.m18094g(p10, "p0");
        View viewInflate = p10.inflate(R.layout.pi2_governmentid_instructions, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i10 = R.id.governmentid_header_bottom_barrier;
        if (((Barrier) AbstractC9123E2.m9654b(viewInflate, R.id.governmentid_header_bottom_barrier)) != null) {
            i10 = R.id.governmentid_header_image_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC9123E2.m9654b(viewInflate, R.id.governmentid_header_image_container);
            if (constraintLayout != null) {
                i10 = R.id.imageview_governmentid_header_image;
                ImageView imageView = (ImageView) AbstractC9123E2.m9654b(viewInflate, R.id.imageview_governmentid_header_image);
                if (imageView != null) {
                    i10 = R.id.list_divider;
                    View viewM9654b = AbstractC9123E2.m9654b(viewInflate, R.id.list_divider);
                    if (viewM9654b != null) {
                        i10 = R.id.navigation_bar;
                        Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) AbstractC9123E2.m9654b(viewInflate, R.id.navigation_bar);
                        if (pi2NavigationBar != null) {
                            i10 = R.id.recyclerview_governmentid_idlist;
                            RecyclerView recyclerView = (RecyclerView) AbstractC9123E2.m9654b(viewInflate, R.id.recyclerview_governmentid_idlist);
                            if (recyclerView != null) {
                                i10 = R.id.textview_governmentid_instructions_body;
                                TextView textView = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.textview_governmentid_instructions_body);
                                if (textView != null) {
                                    i10 = R.id.textview_governmentid_instructions_disclaimer;
                                    TextView textView2 = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.textview_governmentid_instructions_disclaimer);
                                    if (textView2 != null) {
                                        i10 = R.id.textview_governmentid_instructions_title;
                                        TextView textView3 = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.textview_governmentid_instructions_title);
                                        if (textView3 != null) {
                                            i10 = R.id.textview_governmentid_instructionslistheader;
                                            TextView textView4 = (TextView) AbstractC9123E2.m9654b(viewInflate, R.id.textview_governmentid_instructionslistheader);
                                            if (textView4 != null) {
                                                return new C2068f((CoordinatorLayout) viewInflate, constraintLayout, imageView, viewM9654b, pi2NavigationBar, recyclerView, textView, textView2, textView3, textView4);
                                            }
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
