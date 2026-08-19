package p806ia;

import android.util.Property;
import android.view.ViewGroup;
import com.openai.chatgpt.R;

/* JADX INFO: renamed from: ia.c */
/* JADX INFO: loaded from: classes.dex */
public final class C14953c extends Property {

    /* JADX INFO: renamed from: a */
    public static final C14953c f46575a = new C14953c(Float.class, "childrenAlpha");

    @Override // android.util.Property
    public final Object get(Object obj) {
        Float f10 = (Float) ((ViewGroup) obj).getTag(R.id.mtrl_internal_children_alpha_tag);
        return f10 != null ? f10 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        Float f10 = (Float) obj2;
        float fFloatValue = f10.floatValue();
        viewGroup.setTag(R.id.mtrl_internal_children_alpha_tag, f10);
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            viewGroup.getChildAt(i10).setAlpha(fFloatValue);
        }
    }
}
