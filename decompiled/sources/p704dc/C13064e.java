package p704dc;

import ac.C10539a;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.compose.p650ui.platform.AndroidComposeView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p001A.C0017I0;
import p013Ab.C0420b;
import p1014t1.C19726c;
import p1014t1.C19727d;
import p1014t1.C19740q;
import p1060v9.AbstractC20502t;
import p117Eb.C2392v;
import p523V9.AbstractC8088f6;
import p571X9.C9142H3;
import p571X9.C9309j3;
import p571X9.C9321l3;
import p571X9.EnumC9303i3;
import p571X9.EnumC9357r3;
import p571X9.EnumC9363s3;
import p571X9.InterfaceC9161K4;
import p658b5.C11248s;
import p759g1.C13800b;
import sk.C19662a;

/* JADX INFO: renamed from: dc.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13064e implements InterfaceC9161K4 {

    /* JADX INFO: renamed from: Y */
    public long f41493Y;

    /* JADX INFO: renamed from: Z */
    public int f41494Z;

    /* JADX INFO: renamed from: o0 */
    public int f41495o0;

    /* JADX INFO: renamed from: p0 */
    public final Object f41496p0;

    /* JADX INFO: renamed from: q0 */
    public final Object f41497q0;

    /* JADX INFO: renamed from: r0 */
    public final Object f41498r0;

    public /* synthetic */ C13064e(C13065f c13065f, long j10, EnumC9363s3 enumC9363s3, int i10, int i11, C10539a c10539a) {
        this.f41496p0 = c13065f;
        this.f41493Y = j10;
        this.f41497q0 = enumC9363s3;
        this.f41494Z = i10;
        this.f41495o0 = i11;
        this.f41498r0 = c10539a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0141  */
    /* JADX WARN: Code duplicated, block: B:74:0x0144  */
    /* JADX WARN: Code duplicated, block: B:76:0x0147  */
    /* JADX WARN: Code duplicated, block: B:78:0x014a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0150  */
    /* JADX WARN: Code duplicated, block: B:82:0x0153  */
    /* JADX WARN: Code duplicated, block: B:83:0x0157  */
    /* JADX WARN: Code duplicated, block: B:84:0x015c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0161  */
    /* JADX WARN: Code duplicated, block: B:88:0x0174  */
    /* JADX WARN: Code duplicated, block: B:90:0x0182  */
    /* JADX INFO: renamed from: a */
    public C19662a m14800a(MotionEvent motionEvent, AndroidComposeView androidComposeView) {
        int i10;
        int i11;
        long jValueAt;
        long j10;
        long jM11344r;
        long jM20671a;
        long jM11334F;
        int toolType;
        int i12;
        int historySize;
        int i13;
        char c9;
        long jM8536b;
        float historicalX;
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = (SparseLongArray) this.f41496p0;
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.f41497q0;
        if (actionMasked == 3 || actionMasked == 4) {
            sparseLongArray.clear();
            sparseBooleanArray.clear();
            return null;
        }
        if (motionEvent.getPointerCount() == 1) {
            int toolType2 = motionEvent.getToolType(0);
            int source = motionEvent.getSource();
            if (toolType2 != this.f41494Z || source != this.f41495o0) {
                this.f41494Z = toolType2;
                this.f41495o0 = source;
                sparseBooleanArray.clear();
                sparseLongArray.clear();
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        long j11 = 1;
        if (actionMasked2 == 0 || actionMasked2 == 5) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j12 = this.f41493Y;
                this.f41493Y = j12 + 1;
                sparseLongArray.put(pointerId, j12);
                if (motionEvent.getToolType(actionIndex) == 3) {
                    sparseBooleanArray.put(pointerId, true);
                }
            }
        } else if (actionMasked2 == 9) {
            int pointerId2 = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId2) < 0) {
                long j13 = this.f41493Y;
                this.f41493Y = j13 + 1;
                sparseLongArray.put(pointerId2, j13);
            }
        }
        boolean z6 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z10 = actionMasked == 8;
        if (z6) {
            i10 = 1;
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        } else {
            i10 = 1;
        }
        int actionIndex2 = actionMasked != i10 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        ArrayList arrayList = (ArrayList) this.f41498r0;
        arrayList.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i14 = 0;
        while (i14 < pointerCount) {
            boolean z11 = (z6 || i14 == actionIndex2 || (z10 && motionEvent.getButtonState() == 0)) ? false : true;
            int pointerId3 = motionEvent.getPointerId(i14);
            int iIndexOfKey = sparseLongArray.indexOfKey(pointerId3);
            if (iIndexOfKey >= 0) {
                jValueAt = sparseLongArray.valueAt(iIndexOfKey);
            } else {
                long j14 = this.f41493Y;
                this.f41493Y = j14 + j11;
                sparseLongArray.put(pointerId3, j14);
                jValueAt = j14;
            }
            float pressure = motionEvent.getPressure(i14);
            long jM8536b2 = AbstractC8088f6.m8536b(motionEvent.getX(i14), motionEvent.getY(i14));
            long jM15301b = C13800b.m15301b(0.0f, 3, jM8536b2);
            if (i14 == 0) {
                jM20671a = AbstractC8088f6.m8536b(motionEvent.getRawX(), motionEvent.getRawY());
                jM11334F = androidComposeView.m11334F(jM20671a);
            } else {
                if (Build.VERSION.SDK_INT >= 29) {
                    jM20671a = C19727d.f62451a.m20671a(motionEvent, i14);
                    jM11334F = androidComposeView.m11334F(jM20671a);
                } else {
                    j10 = jM8536b2;
                    jM11344r = androidComposeView.m11344r(jM8536b2);
                }
                toolType = motionEvent.getToolType(i14);
                if (toolType == 0) {
                    if (toolType != 1) {
                        i12 = 1;
                    } else if (toolType != 2) {
                        i12 = 3;
                    } else if (toolType != 3) {
                        i12 = 2;
                    } else if (toolType != 4) {
                        i12 = 4;
                    }
                    ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
                    historySize = motionEvent.getHistorySize();
                    for (i13 = 0; i13 < historySize; i13++) {
                        historicalX = motionEvent.getHistoricalX(i14, i13);
                        float historicalY = motionEvent.getHistoricalY(i14, i13);
                        if (Float.isInfinite(historicalX) && !Float.isNaN(historicalX) && !Float.isInfinite(historicalY) && !Float.isNaN(historicalY)) {
                            long jM8536b3 = AbstractC8088f6.m8536b(historicalX, historicalY);
                            arrayList2.add(new C19726c(motionEvent.getHistoricalEventTime(i13), jM8536b3, jM8536b3));
                        }
                    }
                    if (motionEvent.getActionMasked() == 8) {
                        c9 = '\t';
                        jM8536b = AbstractC8088f6.m8536b(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f);
                    } else {
                        c9 = '\t';
                        jM8536b = 0;
                    }
                    arrayList.add(new C19740q(jValueAt, motionEvent.getEventTime(), jM11344r, j10, z11, pressure, i12, sparseBooleanArray.get(motionEvent.getPointerId(i14), false), arrayList2, jM8536b, jM15301b));
                    i14++;
                    z10 = z10;
                    z6 = z6;
                    j11 = 1;
                }
                i12 = 0;
                ArrayList arrayList3 = new ArrayList(motionEvent.getHistorySize());
                historySize = motionEvent.getHistorySize();
                while (i13 < historySize) {
                    historicalX = motionEvent.getHistoricalX(i14, i13);
                    float historicalY2 = motionEvent.getHistoricalY(i14, i13);
                    if (Float.isInfinite(historicalX)) {
                    }
                }
                if (motionEvent.getActionMasked() == 8) {
                    c9 = '\t';
                    jM8536b = AbstractC8088f6.m8536b(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f);
                } else {
                    c9 = '\t';
                    jM8536b = 0;
                }
                arrayList.add(new C19740q(jValueAt, motionEvent.getEventTime(), jM11344r, j10, z11, pressure, i12, sparseBooleanArray.get(motionEvent.getPointerId(i14), false), arrayList3, jM8536b, jM15301b));
                i14++;
                z10 = z10;
                z6 = z6;
                j11 = 1;
            }
            jM11344r = jM20671a;
            j10 = jM11334F;
            toolType = motionEvent.getToolType(i14);
            if (toolType == 0) {
                if (toolType != 1) {
                    i12 = 1;
                } else if (toolType != 2) {
                    i12 = 3;
                } else if (toolType != 3) {
                    i12 = 2;
                } else if (toolType != 4) {
                    i12 = 4;
                }
                ArrayList arrayList4 = new ArrayList(motionEvent.getHistorySize());
                historySize = motionEvent.getHistorySize();
                while (i13 < historySize) {
                    historicalX = motionEvent.getHistoricalX(i14, i13);
                    float historicalY3 = motionEvent.getHistoricalY(i14, i13);
                    if (Float.isInfinite(historicalX)) {
                    }
                }
                if (motionEvent.getActionMasked() == 8) {
                    c9 = '\t';
                    jM8536b = AbstractC8088f6.m8536b(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f);
                } else {
                    c9 = '\t';
                    jM8536b = 0;
                }
                arrayList.add(new C19740q(jValueAt, motionEvent.getEventTime(), jM11344r, j10, z11, pressure, i12, sparseBooleanArray.get(motionEvent.getPointerId(i14), false), arrayList4, jM8536b, jM15301b));
                i14++;
                z10 = z10;
                z6 = z6;
                j11 = 1;
            }
            i12 = 0;
            ArrayList arrayList5 = new ArrayList(motionEvent.getHistorySize());
            historySize = motionEvent.getHistorySize();
            while (i13 < historySize) {
                historicalX = motionEvent.getHistoricalX(i14, i13);
                float historicalY4 = motionEvent.getHistoricalY(i14, i13);
                if (Float.isInfinite(historicalX)) {
                }
            }
            if (motionEvent.getActionMasked() == 8) {
                c9 = '\t';
                jM8536b = AbstractC8088f6.m8536b(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f);
            } else {
                c9 = '\t';
                jM8536b = 0;
            }
            arrayList.add(new C19740q(jValueAt, motionEvent.getEventTime(), jM11344r, j10, z11, pressure, i12, sparseBooleanArray.get(motionEvent.getPointerId(i14), false), arrayList5, jM8536b, jM15301b));
            i14++;
            z10 = z10;
            z6 = z6;
            j11 = 1;
        }
        int actionMasked3 = motionEvent.getActionMasked();
        if (actionMasked3 == 1 || actionMasked3 == 6) {
            int pointerId4 = motionEvent.getPointerId(motionEvent.getActionIndex());
            i11 = 0;
            if (!sparseBooleanArray.get(pointerId4, false)) {
                sparseLongArray.delete(pointerId4);
                sparseBooleanArray.delete(pointerId4);
            }
        } else {
            i11 = 0;
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int iKeyAt = sparseLongArray.keyAt(size);
                int pointerCount2 = motionEvent.getPointerCount();
                int i15 = i11;
                while (true) {
                    if (i15 >= pointerCount2) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(iKeyAt);
                        break;
                    }
                    if (motionEvent.getPointerId(i15) == iKeyAt) {
                        break;
                    }
                    i15++;
                }
            }
        }
        motionEvent.getEventTime();
        return new C19662a(arrayList, motionEvent);
    }

    @Override // p571X9.InterfaceC9161K4
    /* JADX INFO: renamed from: b */
    public C0420b mo365b() {
        int iLimit;
        EnumC9303i3 enumC9303i3;
        C13065f c13065f = (C13065f) this.f41496p0;
        c13065f.getClass();
        C2392v c2392v = new C2392v(21, false);
        C2392v c2392v2 = new C2392v(20, false);
        c2392v2.f7436Z = Long.valueOf(Long.MAX_VALUE & this.f41493Y);
        c2392v2.f7437o0 = (EnumC9363s3) this.f41497q0;
        c2392v2.f7438p0 = Boolean.valueOf(C13065f.f41499j.get());
        Boolean bool = Boolean.TRUE;
        c2392v2.f7439q0 = bool;
        c2392v2.f7440r0 = bool;
        c2392v.f7436Z = new C9321l3(c2392v2);
        c2392v.f7438p0 = AbstractC13066g.m14802a(c13065f.f41501d);
        c2392v.f7439q0 = Integer.valueOf(this.f41494Z & Integer.MAX_VALUE);
        c2392v.f7440r0 = Integer.valueOf(this.f41495o0 & Integer.MAX_VALUE);
        C13065f.f41500k.getClass();
        C10539a c10539a = (C10539a) this.f41498r0;
        int i10 = c10539a.f31260g;
        if (i10 == -1) {
            Bitmap bitmap = c10539a.f31254a;
            AbstractC20502t.m21157h(bitmap);
            iLimit = bitmap.getAllocationByteCount();
        } else if (i10 == 17 || i10 == 842094169) {
            ByteBuffer byteBuffer = c10539a.f31255b;
            AbstractC20502t.m21157h(byteBuffer);
            iLimit = byteBuffer.limit();
        } else if (i10 != 35) {
            iLimit = 0;
        } else {
            Image.Plane[] planeArrM10980a = c10539a.m10980a();
            AbstractC20502t.m21157h(planeArrM10980a);
            iLimit = (planeArrM10980a[0].getBuffer().limit() * 3) / 2;
        }
        C11248s c11248s = new C11248s(16, false);
        if (i10 == -1) {
            enumC9303i3 = EnumC9303i3.BITMAP;
        } else if (i10 == 35) {
            enumC9303i3 = EnumC9303i3.YUV_420_888;
        } else if (i10 == 842094169) {
            enumC9303i3 = EnumC9303i3.YV12;
        } else if (i10 != 16) {
            enumC9303i3 = i10 != 17 ? EnumC9303i3.UNKNOWN_FORMAT : EnumC9303i3.NV21;
        } else {
            enumC9303i3 = EnumC9303i3.NV16;
        }
        c11248s.f34081Z = enumC9303i3;
        c11248s.f34082o0 = Integer.valueOf(iLimit & Integer.MAX_VALUE);
        c2392v.f7437o0 = new C9309j3(c11248s);
        C9142H3 c9142h3 = new C9142H3(c2392v);
        C0017I0 c0017i0 = new C0017I0();
        c0017i0.f66o0 = c13065f.f41505h ? EnumC9357r3.TYPE_THICK : EnumC9357r3.TYPE_THIN;
        c0017i0.f67p0 = c9142h3;
        return new C0420b(c0017i0, 0);
    }

    public C13064e() {
        this.f41496p0 = new SparseLongArray();
        this.f41497q0 = new SparseBooleanArray();
        this.f41498r0 = new ArrayList();
        this.f41494Z = -1;
        this.f41495o0 = -1;
    }
}
