package p1014t1;

import android.view.MotionEvent;
import java.util.List;
import p001A.C0093v0;
import sk.C19662a;

/* JADX INFO: renamed from: t1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C19729f {

    /* JADX INFO: renamed from: a */
    public final Object f62460a;

    /* JADX INFO: renamed from: b */
    public final C0093v0 f62461b;

    /* JADX INFO: renamed from: c */
    public final int f62462c;

    /* JADX INFO: renamed from: d */
    public final int f62463d;

    /* JADX INFO: renamed from: e */
    public int f62464e;

    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    public C19729f(List list, C0093v0 c0093v0) {
        this.f62460a = list;
        this.f62461b = c0093v0;
        MotionEvent motionEvent = c0093v0 != null ? (MotionEvent) ((C19662a) c0093v0.f405p0).f62321Z : null;
        int i10 = 0;
        this.f62462c = motionEvent != null ? motionEvent.getButtonState() : 0;
        MotionEvent motionEvent2 = c0093v0 != null ? (MotionEvent) ((C19662a) c0093v0.f405p0).f62321Z : null;
        this.f62463d = motionEvent2 != null ? motionEvent2.getMetaState() : 0;
        MotionEvent motionEvent3 = c0093v0 != null ? (MotionEvent) ((C19662a) c0093v0.f405p0).f62321Z : null;
        int i11 = 1;
        if (motionEvent3 != null) {
            int actionMasked = motionEvent3.getActionMasked();
            if (actionMasked == 0) {
                i10 = 1;
            } else if (actionMasked == 1) {
                i10 = 2;
            } else if (actionMasked != 2) {
                switch (actionMasked) {
                    case 5:
                        i10 = 1;
                        break;
                    case 6:
                        i10 = 2;
                        break;
                    case 7:
                        i10 = 3;
                        break;
                    case 8:
                        i10 = 6;
                        break;
                    case 9:
                        i10 = 4;
                        break;
                    case 10:
                        i10 = 5;
                        break;
                }
            } else {
                i10 = 3;
            }
            i11 = i10;
        } else {
            int size = list.size();
            while (i10 < size) {
                C19738o c19738o = (C19738o) list.get(i10);
                if (AbstractC19736m.m20681c(c19738o)) {
                    i11 = 2;
                } else if (!AbstractC19736m.m20679a(c19738o)) {
                    i10++;
                }
            }
            i11 = 3;
        }
        this.f62464e = i11;
    }
}
