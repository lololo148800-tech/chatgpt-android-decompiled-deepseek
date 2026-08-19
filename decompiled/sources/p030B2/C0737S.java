package p030B2;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.openai.chatgpt.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: B2.S */
/* JADX INFO: loaded from: classes.dex */
public final class C0737S {

    /* JADX INFO: renamed from: d */
    public static final ArrayList f2092d = new ArrayList();

    /* JADX INFO: renamed from: a */
    public WeakHashMap f2093a;

    /* JADX INFO: renamed from: b */
    public SparseArray f2094b;

    /* JADX INFO: renamed from: c */
    public WeakReference f2095c;

    /* JADX INFO: renamed from: a */
    public final View m1572a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f2093a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View viewM1572a = m1572a(viewGroup.getChildAt(childCount));
                    if (viewM1572a != null) {
                        return viewM1572a;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                throw AbstractC14376f.m15860z(size, arrayList);
            }
        }
        return null;
    }
}
