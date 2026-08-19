package md;

import android.app.assist.AssistStructure;
import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p046Bk.C1342O;
import p1113xn.AbstractC21322p;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: md.k */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17237k {

    /* JADX INFO: renamed from: a */
    public static final C1342O f54993a = new C1342O(29);

    /* JADX INFO: renamed from: a */
    public static void m18965a(AssistStructure.ViewNode viewNode, ArrayList arrayList, int i10, int i11) {
        CharSequence contentDescription;
        String strM19349Y;
        CharSequence text = viewNode.getText();
        if ((text != null && !AbstractC21322p.m21681O(text)) || (((contentDescription = viewNode.getContentDescription()) != null && !AbstractC21322p.m21681O(contentDescription)) || viewNode.isSelected() || viewNode.isChecked() || viewNode.isFocused() || viewNode.isActivated() || viewNode.isCheckable() || viewNode.isClickable())) {
            String className = viewNode.getClassName();
            if (className == null) {
                strM19349Y = "";
            } else {
                List listM21696d0 = AbstractC21322p.m21696d0(className, new char[]{'.'}, 6);
                List list = listM21696d0;
                ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(list, 10));
                int i12 = 0;
                for (Object obj : list) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        AbstractC17681o.m19388q();
                        throw null;
                    }
                    String strValueOf = (String) obj;
                    if (i12 < listM21696d0.size() - 1) {
                        strValueOf = String.valueOf(strValueOf.charAt(0));
                    }
                    arrayList2.add(strValueOf);
                    i12 = i13;
                }
                strM19349Y = AbstractC17680n.m19349Y(arrayList2, Separators.DOT, null, null, 0, null, null, 62);
            }
            String str = strM19349Y;
            CharSequence text2 = viewNode.getText();
            String string = text2 != null ? text2.toString() : null;
            CharSequence contentDescription2 = viewNode.getContentDescription();
            arrayList.add(new C17229c(str, viewNode.getTop() + i10, string, viewNode.getLeft() + i11, contentDescription2 != null ? contentDescription2.toString() : null));
        }
        int childCount = viewNode.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            AssistStructure.ViewNode childAt = viewNode.getChildAt(i14);
            AbstractC16544l.m18093f(childAt, "getChildAt(...)");
            m18965a(childAt, arrayList, viewNode.getTop() + i10, viewNode.getLeft() + i10);
        }
    }
}
