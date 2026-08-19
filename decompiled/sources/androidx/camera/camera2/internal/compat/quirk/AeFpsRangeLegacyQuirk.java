package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import p028B.C0703j;
import p228J.InterfaceC3839h0;

/* JADX INFO: loaded from: classes.dex */
public class AeFpsRangeLegacyQuirk implements InterfaceC3839h0 {

    /* JADX INFO: renamed from: a */
    public final Range f32310a;

    public AeFpsRangeLegacyQuirk(C0703j c0703j) {
        Range[] rangeArr = (Range[]) c0703j.m1476a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        Range range = null;
        if (rangeArr != null && rangeArr.length != 0) {
            for (Range range2 : rangeArr) {
                Range range3 = new Range(Integer.valueOf(((Integer) range2.getLower()).intValue() >= 1000 ? ((Integer) range2.getLower()).intValue() / 1000 : ((Integer) range2.getLower()).intValue()), Integer.valueOf(((Integer) range2.getUpper()).intValue() >= 1000 ? ((Integer) range2.getUpper()).intValue() / 1000 : ((Integer) range2.getUpper()).intValue()));
                if (((Integer) range3.getUpper()).intValue() == 30 && (range == null || ((Integer) range3.getLower()).intValue() < ((Integer) range.getLower()).intValue())) {
                    range = range3;
                }
            }
        }
        this.f32310a = range;
    }
}
