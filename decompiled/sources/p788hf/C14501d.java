package p788hf;

import android.app.Application;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import kotlin.jvm.internal.AbstractC16544l;
import p620Zc.EnumC10276a;
import p620Zc.InterfaceC10277b;
import p972qm.AbstractC18773f;

/* JADX INFO: renamed from: hf.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C14501d implements InterfaceC10277b {

    /* JADX INFO: renamed from: a */
    public final Vibrator f45704a;

    /* JADX INFO: renamed from: b */
    public final boolean f45705b;

    /* JADX INFO: renamed from: c */
    public final boolean f45706c;

    /* JADX INFO: renamed from: d */
    public final boolean f45707d;

    /* JADX INFO: renamed from: e */
    public boolean f45708e;

    public C14501d(Application application) {
        Object systemService = application.getSystemService((Class<Object>) Vibrator.class);
        AbstractC16544l.m18093f(systemService, "getSystemService(...)");
        Vibrator vibrator = (Vibrator) systemService;
        this.f45704a = vibrator;
        int i10 = Build.VERSION.SDK_INT;
        boolean z6 = false;
        this.f45705b = i10 >= 31 && vibrator.areAllPrimitivesSupported(8);
        if (i10 >= 31 && vibrator.areAllPrimitivesSupported(2)) {
            z6 = true;
        }
        this.f45706c = z6;
        this.f45707d = AbstractC18773f.m20050b(application);
    }

    @Override // p620Zc.InterfaceC10277b
    /* JADX INFO: renamed from: a */
    public final void mo10871a() {
        if (this.f45707d && Build.VERSION.SDK_INT >= 30 && this.f45708e) {
            this.f45704a.vibrate(VibrationEffect.startComposition().addPrimitive(1).compose());
        }
    }

    @Override // p620Zc.InterfaceC10277b
    /* JADX INFO: renamed from: b */
    public final void mo10872b(float f10) {
        if (this.f45707d && Build.VERSION.SDK_INT >= 30 && this.f45708e) {
            float f11 = (0.20000002f * f10) + 0.1f;
            VibrationEffect.Composition compositionStartComposition = VibrationEffect.startComposition();
            if (this.f45705b) {
                compositionStartComposition.addPrimitive(8, f11);
            } else {
                compositionStartComposition.addPrimitive(7, f11);
            }
            this.f45704a.vibrate(compositionStartComposition.compose());
        }
    }

    @Override // p620Zc.InterfaceC10277b
    /* JADX INFO: renamed from: c */
    public final boolean mo10873c() {
        return this.f45707d;
    }

    @Override // p620Zc.InterfaceC10277b
    /* JADX INFO: renamed from: d */
    public final void mo10874d(int i10) {
        if (this.f45707d && Build.VERSION.SDK_INT >= 30 && this.f45708e) {
            this.f45704a.vibrate(VibrationEffect.startComposition().addPrimitive(4, 0.7f, i10).compose());
        }
    }

    @Override // p620Zc.InterfaceC10277b
    /* JADX INFO: renamed from: e */
    public final void mo10875e(float f10) {
        if (this.f45707d && Build.VERSION.SDK_INT >= 30 && this.f45708e) {
            this.f45704a.vibrate(VibrationEffect.startComposition().addPrimitive(7, (0.40000004f * f10) + 0.2f).compose());
        }
    }

    @Override // p620Zc.InterfaceC10277b
    /* JADX INFO: renamed from: f */
    public final void mo10876f() {
        if (this.f45707d && Build.VERSION.SDK_INT >= 30 && this.f45708e) {
            this.f45704a.vibrate(VibrationEffect.startComposition().addPrimitive(7).compose());
        }
    }

    @Override // p620Zc.InterfaceC10277b
    /* JADX INFO: renamed from: g */
    public final void mo10877g() {
        if (this.f45707d && Build.VERSION.SDK_INT >= 30 && this.f45708e) {
            this.f45704a.vibrate(VibrationEffect.startComposition().addPrimitive(1, 0.7f).addPrimitive(1, 0.8f, 60).addPrimitive(1, 1.0f, 60).addPrimitive(1, 1.0f, 60).compose());
        }
    }

    @Override // p620Zc.InterfaceC10277b
    /* JADX INFO: renamed from: h */
    public final void mo10878h(EnumC10276a enumC10276a) {
        if (this.f45707d && Build.VERSION.SDK_INT >= 30 && this.f45708e) {
            int iOrdinal = enumC10276a.ordinal();
            Vibrator vibrator = this.f45704a;
            if (iOrdinal == 0) {
                vibrator.vibrate(VibrationEffect.createPredefined(5));
            } else {
                if (iOrdinal != 1) {
                    return;
                }
                if (this.f45706c) {
                    vibrator.vibrate(VibrationEffect.startComposition().addPrimitive(2).compose());
                } else {
                    vibrator.vibrate(VibrationEffect.createPredefined(1));
                }
            }
        }
    }

    @Override // p620Zc.InterfaceC10277b
    public final void setEnabled(boolean z6) {
        this.f45708e = z6;
    }
}
