package p986ra;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputCheckboxComponent;
import kotlin.jvm.internal.AbstractC16544l;
import p103Dn.C2153Q0;
import p1139z0.C21585H;
import p1156zj.C22170l;

/* JADX INFO: renamed from: ra.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C18904a implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60271a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f60272b;

    public /* synthetic */ C18904a(Object obj, int i10) {
        this.f60271a = i10;
        this.f60272b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
        switch (this.f60271a) {
            case 0:
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = ((Chip) this.f60272b).f36544w0;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z6);
                }
                break;
            case 1:
                C21585H c21585h = ((InputCheckboxComponent) this.f60272b).twoStateViewController;
                Boolean boolValueOf = Boolean.valueOf(z6);
                C2153Q0 c2153q0 = (C2153Q0) c21585h.f68344Z;
                c2153q0.getClass();
                c2153q0.m3251l(null, boolValueOf);
                break;
            default:
                C22170l this$0 = (C22170l) this.f60272b;
                AbstractC16544l.m18094g(this$0, "this$0");
                this$0.f70152b.mo210c(z6);
                break;
        }
    }
}
