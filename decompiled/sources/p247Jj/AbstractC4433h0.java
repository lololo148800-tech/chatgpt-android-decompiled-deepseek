package p247Jj;

import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle;
import lk.C17062e;

/* JADX INFO: renamed from: Jj.h0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4433h0 implements Parcelable {

    /* JADX INFO: renamed from: Y */
    public final String f14428Y;

    /* JADX INFO: renamed from: Z */
    public final String f14429Z;

    /* JADX INFO: renamed from: o0 */
    public final AbstractC4413V0 f14430o0;

    /* JADX INFO: renamed from: p0 */
    public final StepStyle f14431p0;

    /* JADX INFO: renamed from: q0 */
    public final NextStep.CancelDialog f14432q0;

    /* JADX INFO: renamed from: r0 */
    public final String f14433r0;

    /* JADX INFO: renamed from: s0 */
    public final C17062e f14434s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f14435t0;

    public AbstractC4433h0() {
        C17062e c17062e = C17062e.f54533o0;
        this.f14428Y = null;
        this.f14429Z = null;
        this.f14430o0 = null;
        this.f14431p0 = null;
        this.f14432q0 = null;
        this.f14433r0 = null;
        this.f14434s0 = c17062e;
    }

    /* JADX INFO: renamed from: a */
    public String mo5190a() {
        return this.f14429Z;
    }

    /* JADX INFO: renamed from: b */
    public NextStep.CancelDialog mo5194b() {
        return this.f14432q0;
    }

    /* JADX INFO: renamed from: c */
    public String mo5195c() {
        return this.f14433r0;
    }

    /* JADX INFO: renamed from: d */
    public C17062e mo5198d() {
        return this.f14434s0;
    }

    /* JADX INFO: renamed from: e */
    public String mo5191e() {
        return this.f14428Y;
    }

    /* JADX INFO: renamed from: f */
    public AbstractC4413V0 mo5192f() {
        return this.f14430o0;
    }

    public StepStyle getStyles() {
        return this.f14431p0;
    }
}
