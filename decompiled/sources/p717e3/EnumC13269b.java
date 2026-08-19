package p717e3;

import androidx.glance.appwidget.protobuf.InterfaceC11061w;

/* JADX INFO: renamed from: e3.b */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC13269b implements InterfaceC11061w {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_DIMENSION_TYPE(0),
    EXACT(1),
    WRAP(2),
    FILL(3),
    EXPAND(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f41950Y;

    EnumC13269b(int i10) {
        this.f41950Y = i10;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f41950Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
