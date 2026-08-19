package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.R0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11905R0 implements InterfaceC11977l1 {

    /* JADX INFO: renamed from: b */
    public static final C11905R0 f36172b = new C11905R0(0);

    /* JADX INFO: renamed from: c */
    public static final C11905R0 f36173c = new C11905R0(1);

    /* JADX INFO: renamed from: d */
    public static final C11905R0 f36174d = new C11905R0(2);

    /* JADX INFO: renamed from: e */
    public static final C11905R0 f36175e = new C11905R0(3);

    /* JADX INFO: renamed from: f */
    public static final C11905R0 f36176f = new C11905R0(4);

    /* JADX INFO: renamed from: g */
    public static final C11905R0 f36177g = new C11905R0(5);

    /* JADX INFO: renamed from: h */
    public static final C11905R0 f36178h = new C11905R0(6);

    /* JADX INFO: renamed from: i */
    public static final C11905R0 f36179i = new C11905R0(7);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36180a;

    public /* synthetic */ C11905R0(int i10) {
        this.f36180a = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC11977l1
    /* JADX INFO: renamed from: a */
    public final boolean mo13323a(int i10) {
        EnumC11942c2 enumC11942c2;
        switch (this.f36180a) {
            case 0:
                switch (i10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return true;
                    default:
                        return false;
                }
            case 1:
                switch (i10) {
                    default:
                        switch (i10) {
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                                break;
                            default:
                                return false;
                        }
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        return true;
                }
                break;
            case 2:
                return AbstractC11957g1.m13452o(i10) != 0;
            case 3:
                if (i10 == 0) {
                    enumC11942c2 = EnumC11942c2.BROADCAST_ACTION_UNSPECIFIED;
                } else if (i10 == 1) {
                    enumC11942c2 = EnumC11942c2.PURCHASES_UPDATED_ACTION;
                } else if (i10 != 2) {
                    enumC11942c2 = i10 != 3 ? null : EnumC11942c2.ALTERNATIVE_BILLING_ACTION;
                } else {
                    enumC11942c2 = EnumC11942c2.LOCAL_PURCHASES_UPDATED_ACTION;
                }
                return enumC11942c2 != null;
            case 4:
                return i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3;
            case 5:
                if (i10 != 17 && i10 != 18) {
                    switch (i10) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            break;
                        default:
                            return false;
                    }
                }
                return true;
            case 6:
                return i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5;
            default:
                return i10 == 0 || i10 == 1;
        }
    }
}
