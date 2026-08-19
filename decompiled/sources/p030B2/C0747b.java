package p030B2;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.openai.chatgpt.R;
import io.sentry.android.core.AbstractC15256t;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p056C2.C1511e;
import p056C2.C1512f;
import p056C2.InterfaceC1522p;
import p960q9.C18655i;

/* JADX INFO: renamed from: B2.b */
/* JADX INFO: loaded from: classes.dex */
public class C0747b {

    /* JADX INFO: renamed from: c */
    public static final View.AccessibilityDelegate f2117c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a */
    public final View.AccessibilityDelegate f2118a;

    /* JADX INFO: renamed from: b */
    public final C0745a f2119b;

    public C0747b() {
        this(f2117c);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo1589a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2118a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: b */
    public C18655i mo636b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f2118a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C18655i(accessibilityNodeProvider, 4);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public void mo1590c(View view, AccessibilityEvent accessibilityEvent) {
        this.f2118a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: d */
    public void mo862d(View view, C1512f c1512f) {
        this.f2118a.onInitializeAccessibilityNodeInfo(view, c1512f.f4042a);
    }

    /* JADX INFO: renamed from: e */
    public void mo1591e(View view, AccessibilityEvent accessibilityEvent) {
        this.f2118a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo1592f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2118a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: g */
    public boolean mo1593g(View view, int i10, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List listEmptyList = (List) view.getTag(R.id.tag_accessibility_actions);
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        boolean z6 = false;
        int i11 = 0;
        while (true) {
            if (i11 < listEmptyList.size()) {
                C1511e c1511e = (C1511e) listEmptyList.get(i11);
                if (c1511e.m2210a() == i10) {
                    InterfaceC1522p interfaceC1522p = c1511e.f4040d;
                    if (interfaceC1522p != null) {
                        Class cls = c1511e.f4039c;
                        if (cls != null) {
                            try {
                                if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                    throw null;
                                }
                                throw new ClassCastException();
                            } catch (Exception e10) {
                                AbstractC15256t.m16466d("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e10);
                            }
                        }
                        zPerformAccessibilityAction = interfaceC1522p.mo205h(view);
                        break;
                    }
                } else {
                    i11++;
                }
            }
            zPerformAccessibilityAction = false;
            break;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f2118a.performAccessibilityAction(view, i10, bundle);
        }
        if (zPerformAccessibilityAction || i10 != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i12 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i12)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i13 = 0; clickableSpanArr != null && i13 < clickableSpanArr.length; i13++) {
                if (clickableSpan.equals(clickableSpanArr[i13])) {
                    clickableSpan.onClick(view);
                    z6 = true;
                    break;
                }
            }
        }
        return z6;
    }

    /* JADX INFO: renamed from: h */
    public void mo1594h(View view, int i10) {
        this.f2118a.sendAccessibilityEvent(view, i10);
    }

    /* JADX INFO: renamed from: i */
    public void mo1595i(View view, AccessibilityEvent accessibilityEvent) {
        this.f2118a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0747b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f2118a = accessibilityDelegate;
        this.f2119b = new C0745a(this);
    }
}
