package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.openai.chatgpt.R;
import p658b5.C11242m;
import p880m.AbstractC17123a;
import p976r.C18816n;
import p976r.InterfaceC18827y;
import p976r.MenuC18814l;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC18827y, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: A0 */
    public boolean f32157A0;

    /* JADX INFO: renamed from: B0 */
    public final Drawable f32158B0;

    /* JADX INFO: renamed from: C0 */
    public final boolean f32159C0;

    /* JADX INFO: renamed from: D0 */
    public LayoutInflater f32160D0;

    /* JADX INFO: renamed from: E0 */
    public boolean f32161E0;

    /* JADX INFO: renamed from: o0 */
    public C18816n f32162o0;

    /* JADX INFO: renamed from: p0 */
    public ImageView f32163p0;

    /* JADX INFO: renamed from: q0 */
    public RadioButton f32164q0;

    /* JADX INFO: renamed from: r0 */
    public TextView f32165r0;

    /* JADX INFO: renamed from: s0 */
    public CheckBox f32166s0;

    /* JADX INFO: renamed from: t0 */
    public TextView f32167t0;

    /* JADX INFO: renamed from: u0 */
    public ImageView f32168u0;

    /* JADX INFO: renamed from: v0 */
    public ImageView f32169v0;

    /* JADX INFO: renamed from: w0 */
    public LinearLayout f32170w0;

    /* JADX INFO: renamed from: x0 */
    public final Drawable f32171x0;

    /* JADX INFO: renamed from: y0 */
    public final int f32172y0;

    /* JADX INFO: renamed from: z0 */
    public final Context f32173z0;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C11242m c11242mM12599G = C11242m.m12599G(getContext(), attributeSet, AbstractC17123a.f54749r, R.attr.listMenuViewStyle);
        this.f32171x0 = c11242mM12599G.m12601B(5);
        TypedArray typedArray = (TypedArray) c11242mM12599G.f34019Z;
        this.f32172y0 = typedArray.getResourceId(1, -1);
        this.f32157A0 = typedArray.getBoolean(7, false);
        this.f32173z0 = context;
        this.f32158B0 = c11242mM12599G.m12601B(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f32159C0 = typedArrayObtainStyledAttributes.hasValue(0);
        c11242mM12599G.m12606H();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f32160D0 == null) {
            this.f32160D0 = LayoutInflater.from(getContext());
        }
        return this.f32160D0;
    }

    private void setSubMenuArrowVisible(boolean z6) {
        ImageView imageView = this.f32168u0;
        if (imageView != null) {
            imageView.setVisibility(z6 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f32169v0;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f32169v0.getLayoutParams();
        rect.top = this.f32169v0.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x005e  */
    @Override // p976r.InterfaceC18827y
    /* JADX INFO: renamed from: c */
    public final void mo11126c(C18816n c18816n) {
        boolean z6;
        int i10;
        String string;
        boolean z10;
        this.f32162o0 = c18816n;
        setVisibility(c18816n.isVisible() ? 0 : 8);
        setTitle(c18816n.f59879e);
        setCheckable(c18816n.isCheckable());
        if (c18816n.f59888n.mo20105o()) {
            if ((c18816n.f59888n.mo20104n() ? c18816n.f59884j : c18816n.f59882h) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
        } else {
            z6 = false;
        }
        c18816n.f59888n.mo20104n();
        if (z6) {
            C18816n c18816n2 = this.f32162o0;
            if (c18816n2.f59888n.mo20105o()) {
                if ((c18816n2.f59888n.mo20104n() ? c18816n2.f59884j : c18816n2.f59882h) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            i10 = z10 ? 0 : 8;
        }
        if (i10 == 0) {
            TextView textView = this.f32167t0;
            C18816n c18816n3 = this.f32162o0;
            char c9 = c18816n3.f59888n.mo20104n() ? c18816n3.f59884j : c18816n3.f59882h;
            if (c9 == 0) {
                string = "";
            } else {
                MenuC18814l menuC18814l = c18816n3.f59888n;
                Resources resources = menuC18814l.f59845a.getResources();
                StringBuilder sb2 = new StringBuilder();
                if (ViewConfiguration.get(menuC18814l.f59845a).hasPermanentMenuKey()) {
                    sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i11 = menuC18814l.mo20104n() ? c18816n3.f59885k : c18816n3.f59883i;
                C18816n.m20135c(i11, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb2);
                C18816n.m20135c(i11, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb2);
                C18816n.m20135c(i11, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb2);
                C18816n.m20135c(i11, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb2);
                C18816n.m20135c(i11, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb2);
                C18816n.m20135c(i11, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb2);
                if (c9 == '\b') {
                    sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c9 == '\n') {
                    sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c9 != ' ') {
                    sb2.append(c9);
                } else {
                    sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb2.toString();
            }
            textView.setText(string);
        }
        if (this.f32167t0.getVisibility() != i10) {
            this.f32167t0.setVisibility(i10);
        }
        setIcon(c18816n.getIcon());
        setEnabled(c18816n.isEnabled());
        setSubMenuArrowVisible(c18816n.hasSubMenu());
        setContentDescription(c18816n.f59891q);
    }

    @Override // p976r.InterfaceC18827y
    public C18816n getItemData() {
        return this.f32162o0;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f32171x0);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f32165r0 = textView;
        int i10 = this.f32172y0;
        if (i10 != -1) {
            textView.setTextAppearance(this.f32173z0, i10);
        }
        this.f32167t0 = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f32168u0 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f32158B0);
        }
        this.f32169v0 = (ImageView) findViewById(R.id.group_divider);
        this.f32170w0 = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.f32163p0 != null && this.f32157A0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f32163p0.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z6) {
        CompoundButton compoundButton;
        View view;
        if (!z6 && this.f32164q0 == null && this.f32166s0 == null) {
            return;
        }
        if ((this.f32162o0.f59898x & 4) != 0) {
            if (this.f32164q0 == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f32164q0 = radioButton;
                LinearLayout linearLayout = this.f32170w0;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f32164q0;
            view = this.f32166s0;
        } else {
            if (this.f32166s0 == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f32166s0 = checkBox;
                LinearLayout linearLayout2 = this.f32170w0;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f32166s0;
            view = this.f32164q0;
        }
        if (z6) {
            compoundButton.setChecked(this.f32162o0.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f32166s0;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f32164q0;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z6) {
        CompoundButton compoundButton;
        if ((this.f32162o0.f59898x & 4) != 0) {
            if (this.f32164q0 == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f32164q0 = radioButton;
                LinearLayout linearLayout = this.f32170w0;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f32164q0;
        } else {
            if (this.f32166s0 == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f32166s0 = checkBox;
                LinearLayout linearLayout2 = this.f32170w0;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f32166s0;
        }
        compoundButton.setChecked(z6);
    }

    public void setForceShowIcon(boolean z6) {
        this.f32161E0 = z6;
        this.f32157A0 = z6;
    }

    public void setGroupDividerEnabled(boolean z6) {
        ImageView imageView = this.f32169v0;
        if (imageView != null) {
            imageView.setVisibility((this.f32159C0 || !z6) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f32162o0.f59888n.getClass();
        boolean z6 = this.f32161E0;
        if (z6 || this.f32157A0) {
            ImageView imageView = this.f32163p0;
            if (imageView == null && drawable == null && !this.f32157A0) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f32163p0 = imageView2;
                LinearLayout linearLayout = this.f32170w0;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f32157A0) {
                this.f32163p0.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f32163p0;
            if (!z6) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f32163p0.getVisibility() != 0) {
                this.f32163p0.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f32165r0.getVisibility() != 8) {
                this.f32165r0.setVisibility(8);
            }
        } else {
            this.f32165r0.setText(charSequence);
            if (this.f32165r0.getVisibility() != 0) {
                this.f32165r0.setVisibility(0);
            }
        }
    }
}
