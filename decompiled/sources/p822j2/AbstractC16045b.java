package p822j2;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.sentry.android.core.AbstractC15256t;
import java.util.Arrays;
import java.util.HashMap;
import p760g2.AbstractC13812i;
import p760g2.C13807d;

/* JADX INFO: renamed from: j2.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16045b extends View {

    /* JADX INFO: renamed from: o0 */
    public int[] f49495o0;

    /* JADX INFO: renamed from: p0 */
    public int f49496p0;

    /* JADX INFO: renamed from: q0 */
    public Context f49497q0;

    /* JADX INFO: renamed from: r0 */
    public AbstractC13812i f49498r0;

    /* JADX INFO: renamed from: s0 */
    public String f49499s0;

    /* JADX INFO: renamed from: t0 */
    public String f49500t0;

    /* JADX INFO: renamed from: u0 */
    public HashMap f49501u0;

    public AbstractC16045b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49495o0 = new int[32];
        this.f49501u0 = new HashMap();
        this.f49497q0 = context;
        mo11358g(attributeSet);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX INFO: renamed from: a */
    public final void m17610a(String str) {
        Context context;
        int identifier;
        HashMap map;
        if (str == null || str.length() == 0 || (context = this.f49497q0) == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (!isInEditMode() || constraintLayout == null) {
            identifier = 0;
        } else {
            Object obj = ((strTrim instanceof String) && (map = constraintLayout.f32841A0) != null && map.containsKey(strTrim)) ? constraintLayout.f32841A0.get(strTrim) : null;
            if (obj instanceof Integer) {
                identifier = ((Integer) obj).intValue();
            } else {
                identifier = 0;
            }
        }
        if (identifier == 0 && constraintLayout != null) {
            identifier = m17615f(constraintLayout, strTrim);
        }
        if (identifier == 0) {
            try {
                identifier = AbstractC16058o.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (identifier == 0) {
            identifier = context.getResources().getIdentifier(strTrim, ParameterNames.f31999ID, context.getPackageName());
        }
        if (identifier != 0) {
            this.f49501u0.put(Integer.valueOf(identifier), strTrim);
            m17611b(identifier);
        } else {
            AbstractC15256t.m16482t("ConstraintHelper", "Could not find id of \"" + strTrim + Separators.DOUBLE_QUOTE);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m17611b(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f49496p0 + 1;
        int[] iArr = this.f49495o0;
        if (i11 > iArr.length) {
            this.f49495o0 = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f49495o0;
        int i12 = this.f49496p0;
        iArr2[i12] = i10;
        this.f49496p0 = i12 + 1;
    }

    /* JADX INFO: renamed from: c */
    public final void m17612c(String str) {
        if (str == null || str.length() == 0 || this.f49497q0 == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            AbstractC15256t.m16482t("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof C16047d) && strTrim.equals(((C16047d) layoutParams).f49527Y)) {
                if (childAt.getId() == -1) {
                    AbstractC15256t.m16482t("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    m17611b(childAt.getId());
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m17613d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f49496p0; i10++) {
            View view = (View) constraintLayout.f32846o0.get(this.f49495o0[i10]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m17615f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f49497q0.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public void mo11358g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC16059p.f49705b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f49499s0 = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f49500t0 = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f49495o0, this.f49496p0);
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo11359h(C13807d c13807d, boolean z6);

    /* JADX INFO: renamed from: i */
    public final void m17616i() {
        if (this.f49498r0 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C16047d) {
            ((C16047d) layoutParams).f49560p0 = this.f49498r0;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f49499s0;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f49500t0;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f49499s0 = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f49496p0 = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                m17610a(str.substring(i10));
                return;
            } else {
                m17610a(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f49500t0 = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f49496p0 = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                m17612c(str.substring(i10));
                return;
            } else {
                m17612c(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f49499s0 = null;
        this.f49496p0 = 0;
        for (int i10 : iArr) {
            m17611b(i10);
        }
    }

    @Override // android.view.View
    public final void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f49499s0 == null) {
            m17611b(i10);
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo17614e(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
