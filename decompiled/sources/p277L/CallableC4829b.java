package p277L;

import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.AbstractC11988o0;
import com.google.android.gms.internal.play_billing.C11927Y1;
import com.google.android.gms.internal.play_billing.C11930Z1;
import com.google.android.gms.internal.play_billing.C11935b;
import com.google.android.gms.internal.play_billing.C11994p2;
import com.google.android.gms.internal.play_billing.C11998q2;
import com.google.android.gms.internal.play_billing.InterfaceC11943d;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A.C0042V0;
import p1003s3.RunnableC19440a;
import p1021t8.C19813d;
import p1060v9.C20489g;
import p1072w2.C20797i;
import p499U9.C7587q;
import p523V9.C8232x6;
import p544W9.C8520M4;
import p571X9.C9173M4;
import p594Y9.C9788P4;
import p813ij.C15026j;
import p826j6.AbstractC16142K;
import p826j6.AbstractC16144M;
import p826j6.C16149c;
import p826j6.C16155i;
import p826j6.ServiceConnectionC16132A;

/* JADX INFO: renamed from: L.b */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC4829b implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15723a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f15724b;

    public /* synthetic */ CallableC4829b(Object obj, int i10) {
        this.f15723a = i10;
        this.f15724b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x019f  */
    /* JADX WARN: Code duplicated, block: B:103:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:106:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:107:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:110:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:115:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:118:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:119:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:122:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:123:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:126:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:127:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:130:0x01da  */
    /* JADX WARN: Code duplicated, block: B:131:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:134:0x01e1 A[Catch: Exception -> 0x009d, TryCatch #0 {Exception -> 0x009d, blocks: (B:39:0x007f, B:40:0x0083, B:44:0x008b, B:47:0x00a0, B:50:0x00b0, B:53:0x00da, B:56:0x00f6, B:60:0x00fe, B:64:0x0105, B:66:0x010b, B:71:0x011a, B:74:0x0144, B:75:0x015f, B:72:0x0138, B:76:0x0163, B:80:0x016c, B:84:0x0175, B:88:0x017e, B:92:0x0187, B:96:0x0190, B:100:0x0199, B:104:0x01a2, B:108:0x01ab, B:112:0x01b4, B:116:0x01bd, B:120:0x01c6, B:124:0x01cd, B:128:0x01d6, B:132:0x01dd, B:134:0x01e1, B:136:0x01ec, B:137:0x01f0, B:153:0x0217, B:156:0x0221, B:160:0x0227, B:54:0x00f1, B:51:0x00cf, B:164:0x0230, B:138:0x01f1, B:140:0x01f7, B:147:0x0202, B:149:0x020e, B:151:0x0214, B:41:0x0084, B:42:0x0088), top: B:219:0x007f, inners: #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x01ec A[Catch: Exception -> 0x009d, TryCatch #0 {Exception -> 0x009d, blocks: (B:39:0x007f, B:40:0x0083, B:44:0x008b, B:47:0x00a0, B:50:0x00b0, B:53:0x00da, B:56:0x00f6, B:60:0x00fe, B:64:0x0105, B:66:0x010b, B:71:0x011a, B:74:0x0144, B:75:0x015f, B:72:0x0138, B:76:0x0163, B:80:0x016c, B:84:0x0175, B:88:0x017e, B:92:0x0187, B:96:0x0190, B:100:0x0199, B:104:0x01a2, B:108:0x01ab, B:112:0x01b4, B:116:0x01bd, B:120:0x01c6, B:124:0x01cd, B:128:0x01d6, B:132:0x01dd, B:134:0x01e1, B:136:0x01ec, B:137:0x01f0, B:153:0x0217, B:156:0x0221, B:160:0x0227, B:54:0x00f1, B:51:0x00cf, B:164:0x0230, B:138:0x01f1, B:140:0x01f7, B:147:0x0202, B:149:0x020e, B:151:0x0214, B:41:0x0084, B:42:0x0088), top: B:219:0x007f, inners: #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x01f7 A[Catch: all -> 0x01fb, DONT_GENERATE, TryCatch #6 {all -> 0x01fb, blocks: (B:138:0x01f1, B:140:0x01f7, B:147:0x0202, B:149:0x020e, B:151:0x0214), top: B:229:0x01f1, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x01fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:146:0x0201  */
    /* JADX WARN: Code duplicated, block: B:149:0x020e A[Catch: all -> 0x01fb, TryCatch #6 {all -> 0x01fb, blocks: (B:138:0x01f1, B:140:0x01f7, B:147:0x0202, B:149:0x020e, B:151:0x0214), top: B:229:0x01f1, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x0213  */
    /* JADX WARN: Code duplicated, block: B:153:0x0217 A[Catch: Exception -> 0x009d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x009d, blocks: (B:39:0x007f, B:40:0x0083, B:44:0x008b, B:47:0x00a0, B:50:0x00b0, B:53:0x00da, B:56:0x00f6, B:60:0x00fe, B:64:0x0105, B:66:0x010b, B:71:0x011a, B:74:0x0144, B:75:0x015f, B:72:0x0138, B:76:0x0163, B:80:0x016c, B:84:0x0175, B:88:0x017e, B:92:0x0187, B:96:0x0190, B:100:0x0199, B:104:0x01a2, B:108:0x01ab, B:112:0x01b4, B:116:0x01bd, B:120:0x01c6, B:124:0x01cd, B:128:0x01d6, B:132:0x01dd, B:134:0x01e1, B:136:0x01ec, B:137:0x01f0, B:153:0x0217, B:156:0x0221, B:160:0x0227, B:54:0x00f1, B:51:0x00cf, B:164:0x0230, B:138:0x01f1, B:140:0x01f7, B:147:0x0202, B:149:0x020e, B:151:0x0214, B:41:0x0084, B:42:0x0088), top: B:219:0x007f, inners: #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x0222 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:158:0x0224  */
    /* JADX WARN: Code duplicated, block: B:159:0x0226  */
    /* JADX WARN: Code duplicated, block: B:180:0x0258  */
    /* JADX WARN: Code duplicated, block: B:181:0x025d  */
    /* JADX WARN: Code duplicated, block: B:229:0x01f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0169  */
    /* JADX WARN: Code duplicated, block: B:79:0x016b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0172  */
    /* JADX WARN: Code duplicated, block: B:83:0x0174  */
    /* JADX WARN: Code duplicated, block: B:86:0x017b  */
    /* JADX WARN: Code duplicated, block: B:87:0x017d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0184  */
    /* JADX WARN: Code duplicated, block: B:91:0x0186  */
    /* JADX WARN: Code duplicated, block: B:94:0x018d  */
    /* JADX WARN: Code duplicated, block: B:95:0x018f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0196  */
    /* JADX WARN: Code duplicated, block: B:99:0x0198  */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle;
        int i10;
        int i11;
        String strM17716a;
        int iM13404s;
        String str;
        boolean z6;
        InterfaceC11943d interfaceC11943d;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        C0042V0 c0042v0;
        switch (this.f15723a) {
            case 0:
                ((Runnable) this.f15724b).run();
                return null;
            case 1:
                C7587q c7587q = (C7587q) this.f15724b;
                c7587q.getClass();
                return C20489g.f65055c.m21137a(c7587q.f24009a);
            case 2:
                C8232x6 c8232x6 = (C8232x6) this.f15724b;
                c8232x6.getClass();
                return C20489g.f65055c.m21137a(c8232x6.f25706g);
            case 3:
                C8520M4 c8520m4 = (C8520M4) this.f15724b;
                c8520m4.getClass();
                return C20489g.f65055c.m21137a(c8520m4.f26345g);
            case 4:
                C9173M4 c9173m4 = (C9173M4) this.f15724b;
                c9173m4.getClass();
                return C20489g.f65055c.m21137a(c9173m4.f27959g);
            case 5:
                C9788P4 c9788p4 = (C9788P4) this.f15724b;
                c9788p4.getClass();
                return C20489g.f65055c.m21137a(c9788p4.f29307g);
            case 6:
                ServiceConnectionC16132A serviceConnectionC16132A = (ServiceConnectionC16132A) this.f15724b;
                synchronized (serviceConnectionC16132A.f50052b.f50112a) {
                    try {
                        if (serviceConnectionC16132A.f50052b.f50113b != 3) {
                            int i13 = serviceConnectionC16132A.f50052b.f50113b;
                            if (TextUtils.isEmpty(null)) {
                                bundle = null;
                            } else {
                                bundle = new Bundle();
                                bundle.putString("accountName", null);
                                C16149c c16149c = serviceConnectionC16132A.f50052b;
                                AbstractC11988o0.m13507b(bundle, c16149c.f50114c, c16149c.f50111E.longValue());
                            }
                            try {
                                synchronized (serviceConnectionC16132A.f50052b.f50112a) {
                                    interfaceC11943d = serviceConnectionC16132A.f50052b.f50119h;
                                    break;
                                }
                                if (interfaceC11943d == null) {
                                    serviceConnectionC16132A.f50052b.m17766p(0);
                                    C16149c c16149c2 = serviceConnectionC16132A.f50052b;
                                    C16155i c16155i = AbstractC16144M.f50088k;
                                    c16149c2.m17756D(119, 6, c16155i);
                                    serviceConnectionC16132A.m17685a(c16155i);
                                } else {
                                    String packageName = serviceConnectionC16132A.f50052b.f50117f.getPackageName();
                                    iM13404s = 3;
                                    int i14 = 23;
                                    while (true) {
                                        if (i14 >= 3) {
                                            if (bundle == null) {
                                                C11935b c11935b = (C11935b) interfaceC11943d;
                                                Parcel parcelM6119p = c11935b.m6119p();
                                                parcelM6119p.writeInt(i14);
                                                parcelM6119p.writeString(packageName);
                                                parcelM6119p.writeString("subs");
                                                Parcel parcelM6120q = c11935b.m6120q(parcelM6119p, 1);
                                                int i15 = parcelM6120q.readInt();
                                                parcelM6120q.recycle();
                                                iM13404s = i15;
                                            } else {
                                                iM13404s = ((C11935b) interfaceC11943d).m13404s(i14, packageName, "subs", bundle);
                                            }
                                            if (iM13404s == 0) {
                                                AbstractC11988o0.m13511f("BillingClient", "highestLevelSupportedForSubs: " + i14);
                                            } else {
                                                i14--;
                                            }
                                        } else {
                                            i14 = 0;
                                        }
                                    }
                                    C16149c c16149c3 = serviceConnectionC16132A.f50052b;
                                    c16149c3.f50122k = i14 >= 5;
                                    c16149c3.f50121j = i14 >= 3;
                                    if (i14 < 3) {
                                        AbstractC11988o0.m13511f("BillingClient", "In-app billing API does not support subscription on this device.");
                                        i10 = 9;
                                    } else {
                                        i10 = 1;
                                    }
                                    for (int i16 = 23; i16 >= 3; i16--) {
                                        if (bundle == null) {
                                            C11935b c11935b2 = (C11935b) interfaceC11943d;
                                            Parcel parcelM6119p2 = c11935b2.m6119p();
                                            parcelM6119p2.writeInt(i16);
                                            parcelM6119p2.writeString(packageName);
                                            parcelM6119p2.writeString("inapp");
                                            Parcel parcelM6120q2 = c11935b2.m6120q(parcelM6119p2, 1);
                                            iM13404s = parcelM6120q2.readInt();
                                            parcelM6120q2.recycle();
                                        } else {
                                            iM13404s = ((C11935b) interfaceC11943d).m13404s(i16, packageName, "inapp", bundle);
                                        }
                                        if (iM13404s == 0) {
                                            serviceConnectionC16132A.f50052b.f50123l = i16;
                                            AbstractC11988o0.m13511f("BillingClient", "mHighestLevelSupportedForInApp: " + i16);
                                            C16149c c16149c4 = serviceConnectionC16132A.f50052b;
                                            i12 = c16149c4.f50123l;
                                            if (i12 >= 23) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            c16149c4.f50137z = z10;
                                            if (i12 >= 22) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            c16149c4.f50136y = z11;
                                            if (i12 >= 21) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            c16149c4.f50135x = z12;
                                            if (i12 >= 20) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                            c16149c4.f50134w = z13;
                                            if (i12 >= 19) {
                                                z14 = true;
                                            } else {
                                                z14 = false;
                                            }
                                            c16149c4.f50133v = z14;
                                            if (i12 >= 18) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                            c16149c4.f50132u = z15;
                                            if (i12 >= 17) {
                                                z16 = true;
                                            } else {
                                                z16 = false;
                                            }
                                            c16149c4.f50131t = z16;
                                            if (i12 >= 16) {
                                                z17 = true;
                                            } else {
                                                z17 = false;
                                            }
                                            c16149c4.f50130s = z17;
                                            if (i12 >= 15) {
                                                z18 = true;
                                            } else {
                                                z18 = false;
                                            }
                                            c16149c4.f50129r = z18;
                                            if (i12 >= 14) {
                                                z19 = true;
                                            } else {
                                                z19 = false;
                                            }
                                            c16149c4.f50128q = z19;
                                            if (i12 >= 12) {
                                                z20 = true;
                                            } else {
                                                z20 = false;
                                            }
                                            c16149c4.f50127p = z20;
                                            if (i12 >= 9) {
                                                z21 = true;
                                            } else {
                                                z21 = false;
                                            }
                                            c16149c4.f50126o = z21;
                                            if (i12 >= 8) {
                                                z22 = true;
                                            } else {
                                                z22 = false;
                                            }
                                            c16149c4.f50125n = z22;
                                            if (i12 >= 6) {
                                                z23 = true;
                                            } else {
                                                z23 = false;
                                            }
                                            c16149c4.f50124m = z23;
                                            if (i12 < 3) {
                                                AbstractC11988o0.m13512g("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                                i10 = 36;
                                            }
                                            if (iM13404s == 0) {
                                                synchronized (serviceConnectionC16132A.f50052b.f50112a) {
                                                    try {
                                                        if (serviceConnectionC16132A.f50052b.f50113b == 3) {
                                                            if (i13 == 1) {
                                                                z6 = false;
                                                            } else {
                                                                z6 = true;
                                                            }
                                                            serviceConnectionC16132A.f50052b.m17766p(2);
                                                            if (serviceConnectionC16132A.f50052b.f50116e != null) {
                                                                c0042v0 = serviceConnectionC16132A.f50052b.f50116e;
                                                            } else {
                                                                c0042v0 = null;
                                                            }
                                                            if (c0042v0 != null) {
                                                                c0042v0.m223q(serviceConnectionC16132A.f50052b.f50135x);
                                                            }
                                                        }
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                                return null;
                                            }
                                            if (i13 == 1) {
                                                z6 = false;
                                            } else {
                                                z6 = true;
                                            }
                                            serviceConnectionC16132A.f50052b.m17766p(0);
                                            str = null;
                                        }
                                    }
                                    C16149c c16149c5 = serviceConnectionC16132A.f50052b;
                                    i12 = c16149c5.f50123l;
                                    if (i12 >= 23) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    c16149c5.f50137z = z10;
                                    if (i12 >= 22) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    c16149c5.f50136y = z11;
                                    if (i12 >= 21) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    c16149c5.f50135x = z12;
                                    if (i12 >= 20) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    c16149c5.f50134w = z13;
                                    if (i12 >= 19) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    c16149c5.f50133v = z14;
                                    if (i12 >= 18) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    c16149c5.f50132u = z15;
                                    if (i12 >= 17) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    c16149c5.f50131t = z16;
                                    if (i12 >= 16) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    c16149c5.f50130s = z17;
                                    if (i12 >= 15) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    c16149c5.f50129r = z18;
                                    if (i12 >= 14) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    c16149c5.f50128q = z19;
                                    if (i12 >= 12) {
                                        z20 = true;
                                    } else {
                                        z20 = false;
                                    }
                                    c16149c5.f50127p = z20;
                                    if (i12 >= 9) {
                                        z21 = true;
                                    } else {
                                        z21 = false;
                                    }
                                    c16149c5.f50126o = z21;
                                    if (i12 >= 8) {
                                        z22 = true;
                                    } else {
                                        z22 = false;
                                    }
                                    c16149c5.f50125n = z22;
                                    if (i12 >= 6) {
                                        z23 = true;
                                    } else {
                                        z23 = false;
                                    }
                                    c16149c5.f50124m = z23;
                                    if (i12 < 3) {
                                        AbstractC11988o0.m13512g("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                        i10 = 36;
                                    }
                                    if (iM13404s == 0) {
                                        synchronized (serviceConnectionC16132A.f50052b.f50112a) {
                                            if (serviceConnectionC16132A.f50052b.f50113b == 3) {
                                                if (i13 == 1) {
                                                    z6 = false;
                                                } else {
                                                    z6 = true;
                                                }
                                                serviceConnectionC16132A.f50052b.m17766p(2);
                                                if (serviceConnectionC16132A.f50052b.f50116e != null) {
                                                    c0042v0 = serviceConnectionC16132A.f50052b.f50116e;
                                                } else {
                                                    c0042v0 = null;
                                                }
                                                if (c0042v0 != null) {
                                                    c0042v0.m223q(serviceConnectionC16132A.f50052b.f50135x);
                                                }
                                            }
                                            return null;
                                        }
                                    }
                                    if (i13 == 1) {
                                        z6 = false;
                                    } else {
                                        z6 = true;
                                    }
                                    serviceConnectionC16132A.f50052b.m17766p(0);
                                    str = null;
                                }
                            } catch (Exception e10) {
                                boolean z24 = i13 != 1;
                                AbstractC11988o0.m13513h("BillingClient", "Exception while checking if billing is supported; try to reconnect", e10);
                                if (e10 instanceof DeadObjectException) {
                                    i11 = 101;
                                } else if (e10 instanceof RemoteException) {
                                    i11 = 100;
                                } else {
                                    if (e10 instanceof SecurityException) {
                                        i11 = 102;
                                    } else {
                                        i10 = 42;
                                    }
                                    if (i10 == 42) {
                                        strM17716a = AbstractC16142K.m17716a(e10);
                                    } else {
                                        strM17716a = null;
                                    }
                                    serviceConnectionC16132A.f50052b.m17766p(0);
                                    iM13404s = 6;
                                    boolean z25 = z24;
                                    str = strM17716a;
                                    z6 = z25;
                                }
                                i10 = i11;
                                if (i10 == 42) {
                                    strM17716a = AbstractC16142K.m17716a(e10);
                                } else {
                                    strM17716a = null;
                                }
                                serviceConnectionC16132A.f50052b.m17766p(0);
                                iM13404s = 6;
                                boolean z26 = z24;
                                str = strM17716a;
                                z6 = z26;
                            }
                            if (iM13404s == 0) {
                                try {
                                    if (true != z6) {
                                        serviceConnectionC16132A.f50052b.m17758F(6);
                                    } else {
                                        C15026j c15026j = serviceConnectionC16132A.f50052b.f50118g;
                                        C11994p2 c11994p2M13521o = C11998q2.m13521o();
                                        C11927Y1 c11927y1M13380r = C11930Z1.m13380r();
                                        c11927y1M13380r.m13369e(0);
                                        c11994p2M13521o.m13473d();
                                        C11998q2.m13520n((C11998q2) c11994p2M13521o.f36278Z, (C11930Z1) c11927y1M13380r.m13471b());
                                        c15026j.m16157x((C11998q2) c11994p2M13521o.m13471b());
                                    }
                                } catch (Throwable th3) {
                                    AbstractC11988o0.m13513h("BillingClient", "Unable to log.", th3);
                                }
                                serviceConnectionC16132A.m17685a(AbstractC16144M.f50087j);
                                break;
                            } else {
                                C16155i c16155i2 = AbstractC16144M.f50078a;
                                try {
                                    if (true != z6) {
                                        serviceConnectionC16132A.f50052b.m17757E(i10, 6, c16155i2, str);
                                    } else {
                                        C11927Y1 c11927y1M13380r2 = C11930Z1.m13380r();
                                        c11927y1M13380r2.m13369e(c16155i2.f50151a);
                                        String str2 = c16155i2.f50152b;
                                        c11927y1M13380r2.m13473d();
                                        C11930Z1.m13377o((C11930Z1) c11927y1M13380r2.f36278Z, str2);
                                        c11927y1M13380r2.m13370f(i10);
                                        if (str != null) {
                                            c11927y1M13380r2.m13473d();
                                            C11930Z1.m13376n((C11930Z1) c11927y1M13380r2.f36278Z, str);
                                        }
                                        C15026j c15026j2 = serviceConnectionC16132A.f50052b.f50118g;
                                        C11994p2 c11994p2M13521o2 = C11998q2.m13521o();
                                        C11930Z1 c11930z1 = (C11930Z1) c11927y1M13380r2.m13471b();
                                        c11994p2M13521o2.m13473d();
                                        C11998q2.m13520n((C11998q2) c11994p2M13521o2.f36278Z, c11930z1);
                                        c15026j2.m16157x((C11998q2) c11994p2M13521o2.m13471b());
                                    }
                                } catch (Throwable th4) {
                                    AbstractC11988o0.m13513h("BillingClient", "Unable to log.", th4);
                                }
                                serviceConnectionC16132A.m17685a(AbstractC16144M.f50078a);
                            }
                            return null;
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                return null;
            case 7:
                return (C19813d) this.f15724b;
            default:
                RunnableC19440a runnableC19440a = (RunnableC19440a) this.f15724b;
                AtomicBoolean atomicBoolean = runnableC19440a.f61644p0;
                AtomicBoolean atomicBoolean2 = runnableC19440a.f61643o0;
                atomicBoolean.set(true);
                try {
                    Process.setThreadPriority(10);
                    try {
                        runnableC19440a.f61645q0.m20015d();
                        break;
                    } catch (C20797i e11) {
                        if (!atomicBoolean2.get()) {
                            throw e11;
                        }
                    }
                    Binder.flushPendingCommands();
                    runnableC19440a.m20517a(null);
                    return null;
                } catch (Throwable th6) {
                    try {
                        atomicBoolean2.set(true);
                        throw th6;
                    } catch (Throwable th7) {
                        runnableC19440a.m20517a(null);
                        throw th7;
                    }
                }
        }
    }
}
