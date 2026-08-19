package p030B2;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.openai.chatgpt.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p056C2.C1511e;
import p056C2.C1512f;
import p960q9.C18655i;

/* JADX INFO: renamed from: B2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0745a extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: a */
    public final C0747b f2113a;

    public C0745a(C0747b c0747b) {
        this.f2113a = c0747b;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2113a.mo1589a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        C18655i c18655iMo636b = this.f2113a.mo636b(view);
        if (c18655iMo636b != null) {
            return (AccessibilityNodeProvider) c18655iMo636b.f59414Z;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f2113a.mo1590c(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        Object tag2;
        Object tag3;
        int iKeyAt;
        int i10 = 1;
        C1512f c1512f = new C1512f(accessibilityNodeInfo);
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = Boolean.valueOf(AbstractC0733N.m1563c(view));
        } else {
            tag = view.getTag(R.id.tag_screen_reader_focusable);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        int i11 = 0;
        boolean z6 = bool != null && bool.booleanValue();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z6);
        } else {
            c1512f.m2218h(1, z6);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            tag2 = Boolean.valueOf(AbstractC0733N.m1562b(view));
        } else {
            tag2 = view.getTag(R.id.tag_accessibility_heading);
            if (!Boolean.class.isInstance(tag2)) {
                tag2 = null;
            }
        }
        Boolean bool2 = (Boolean) tag2;
        boolean z10 = bool2 != null && bool2.booleanValue();
        if (i12 >= 28) {
            accessibilityNodeInfo.setHeading(z10);
        } else {
            c1512f.m2218h(2, z10);
        }
        CharSequence charSequenceM1576d = AbstractC0738T.m1576d(view);
        if (i12 >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequenceM1576d);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequenceM1576d);
        }
        if (i12 >= 30) {
            tag3 = AbstractC0735P.m1569a(view);
        } else {
            tag3 = view.getTag(R.id.tag_state_description);
            if (!CharSequence.class.isInstance(tag3)) {
                tag3 = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag3;
        if (i12 >= 30) {
            AbstractC0763j.m1700i(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f2113a.mo862d(view, c1512f);
        CharSequence text = accessibilityNodeInfo.getText();
        if (i12 < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    if (((WeakReference) sparseArray.valueAt(i13)).get() == null) {
                        arrayList.add(Integer.valueOf(i13));
                    }
                }
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    sparseArray.remove(((Integer) arrayList.get(i14)).intValue());
                }
            }
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                }
                int i15 = 0;
                while (i15 < clickableSpanArr.length) {
                    ClickableSpan clickableSpan = clickableSpanArr[i15];
                    int i16 = i11;
                    while (true) {
                        if (i16 >= sparseArray2.size()) {
                            iKeyAt = C1512f.f4041d;
                            C1512f.f4041d = iKeyAt + 1;
                            break;
                        } else {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i16)).get())) {
                                iKeyAt = sparseArray2.keyAt(i16);
                                break;
                            }
                            i16 += i10;
                        }
                    }
                    sparseArray2.put(iKeyAt, new WeakReference(clickableSpanArr[i15]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i15];
                    Spanned spanned = (Spanned) text;
                    c1512f.m2214c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    c1512f.m2214c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    c1512f.m2214c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    c1512f.m2214c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(iKeyAt));
                    i10 = 1;
                    i15++;
                    i11 = 0;
                }
            }
        }
        List listEmptyList = (List) view.getTag(R.id.tag_accessibility_actions);
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        for (int i17 = 0; i17 < listEmptyList.size(); i17++) {
            c1512f.m2213b((C1511e) listEmptyList.get(i17));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f2113a.mo1591e(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2113a.mo1592f(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        return this.f2113a.mo1593g(view, i10, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i10) {
        this.f2113a.mo1594h(view, i10);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f2113a.mo1595i(view, accessibilityEvent);
    }
}
