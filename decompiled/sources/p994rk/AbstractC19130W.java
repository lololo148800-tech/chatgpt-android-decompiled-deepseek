package p994rk;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputCheckboxComponent;
import java.util.LinkedList;
import p021Aj.ViewOnClickListenerC0529n;
import p103Dn.C2153Q0;
import p1113xn.AbstractC21322p;
import p310M9.C5311e;
import p523V9.AbstractC8040Z5;
import p523V9.AbstractC8094g4;
import p955q2.AbstractC18616h;
import p955q2.AbstractC18619k;
import p979r2.AbstractC18861b;
import p986ra.C18904a;
import uk.C20376f;

/* JADX INFO: renamed from: rk.W */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC19130W {
    /* JADX INFO: renamed from: a */
    public static final ConstraintLayout m20306a(InputCheckboxComponent inputCheckboxComponent, C5311e c5311e, C20376f c20376f) {
        AttributeStyles.TextBasedTextColorStyle textColorHighlight;
        StyleElements.SimpleElementColor base;
        StyleElements.SimpleElementColorValue base2;
        Integer value;
        float fM19972a;
        boolean zBooleanValue = ((Boolean) ((C2153Q0) inputCheckboxComponent.twoStateViewController.f68344Z).getValue()).booleanValue();
        MaterialCheckBox materialCheckBox = c20376f.f64436b;
        materialCheckBox.setChecked(zBooleanValue);
        UiComponentConfig.InputCheckbox inputCheckbox = inputCheckboxComponent.f40941Y;
        UiComponentConfig.InputCheckbox.Attributes attributes = inputCheckbox.getAttributes();
        String label = attributes != null ? attributes.getLabel() : null;
        TextView textView = c20376f.f64439e;
        if (label == null || AbstractC21322p.m21681O(label)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            AbstractC8094g4.m8563d(textView, label);
        }
        UiComponentConfig.InputCheckbox.Attributes attributes2 = inputCheckbox.getAttributes();
        String descriptionText = attributes2 != null ? attributes2.getDescriptionText() : null;
        TextView textView2 = c20376f.f64437c;
        if (descriptionText == null || AbstractC21322p.m21681O(descriptionText)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            AbstractC8094g4.m8563d(textView2, descriptionText);
        }
        materialCheckBox.setOnCheckedChangeListener(new C18904a(inputCheckboxComponent, 1));
        textView.setOnClickListener(new ViewOnClickListenerC0529n(c20376f, 9));
        UiComponentConfig.InputCheckbox.InputCheckboxComponentStyle styles = inputCheckbox.getStyles();
        if (styles != null && (textColorHighlight = styles.getTextColorHighlight()) != null && (base = textColorHighlight.getBase()) != null && (base2 = base.getBase()) != null && (value = base2.getValue()) != null) {
            int iIntValue = value.intValue();
            Context context = (Context) c5311e.f17484Z;
            int iM8408d = AbstractC8040Z5.m8408d(context, R.attr.colorOnSurface);
            Resources resources = context.getResources();
            if (Build.VERSION.SDK_INT >= 29) {
                ThreadLocal threadLocal = AbstractC18619k.f59299a;
                fM19972a = AbstractC18616h.m19972a(resources);
            } else {
                ThreadLocal threadLocal2 = AbstractC18619k.f59299a;
                TypedValue typedValue = (TypedValue) threadLocal2.get();
                if (typedValue == null) {
                    typedValue = new TypedValue();
                    threadLocal2.set(typedValue);
                }
                resources.getValue(R.dimen.material_emphasis_disabled, typedValue, true);
                if (typedValue.type != 4) {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(R.dimen.material_emphasis_disabled) + " type #0x" + Integer.toHexString(typedValue.type) + " is not valid");
                }
                fM19972a = typedValue.getFloat();
            }
            materialCheckBox.setButtonTintList(new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{-16842912}, new int[]{android.R.attr.state_checked}}, new int[]{AbstractC18861b.m20169g(iM8408d, (int) (fM19972a * 255)), AbstractC8040Z5.m8408d(context, R.attr.colorOnSurface), iIntValue}));
        }
        ((LinkedList) c5311e.f17486p0).add(new C19127V(inputCheckboxComponent, c20376f));
        ConstraintLayout constraintLayout = c20376f.f64435a;
        constraintLayout.setTag(c20376f);
        return constraintLayout;
    }
}
