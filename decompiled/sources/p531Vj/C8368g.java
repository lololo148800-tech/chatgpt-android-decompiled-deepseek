package p531Vj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1440o;
import p555Wj.C8885a;

/* JADX INFO: renamed from: Vj.g */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8368g extends AbstractC16541i implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public static final C8368g f26064Y = new C8368g(3, C8885a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/permissions/databinding/Pi2CheckRequestPermissionRationaleStateBinding;", 0);

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p10 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        AbstractC16544l.m18094g(p10, "p0");
        View viewInflate = p10.inflate(R.layout.pi2_check_request_permission_rationale_state, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        if (viewInflate != null) {
            return new C8885a(viewInflate);
        }
        throw new NullPointerException("rootView");
    }
}
