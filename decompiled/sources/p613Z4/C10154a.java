package p613Z4;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.jvm.internal.AbstractC16544l;
import p444S4.C7011q;
import p719e5.C13285a;

/* JADX INFO: renamed from: Z4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10154a extends AbstractC10157d {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f30084g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10154a(Context context, C13285a c13285a, int i10) {
        super(context, c13285a);
        this.f30084g = i10;
    }

    @Override // p613Z4.AbstractC10159f
    /* JADX INFO: renamed from: a */
    public final Object mo10755a() {
        switch (this.f30084g) {
            case 0:
                Intent intentRegisterReceiver = ((Context) this.f30090b).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver == null) {
                    C7011q.m7408d().m7411b(AbstractC10155b.f30085a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                return Boolean.valueOf(intExtra == 2 || intExtra == 5);
            case 1:
                Intent intentRegisterReceiver2 = ((Context) this.f30090b).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver2 == null) {
                    C7011q.m7408d().m7411b(AbstractC10156c.f30086a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra2 = intentRegisterReceiver2.getIntExtra("status", -1);
                float intExtra3 = intentRegisterReceiver2.getIntExtra("level", -1) / intentRegisterReceiver2.getIntExtra("scale", -1);
                boolean z6 = true;
                if (intExtra2 != 1 && intExtra3 <= 0.15f) {
                    z6 = false;
                }
                return Boolean.valueOf(z6);
            default:
                Intent intentRegisterReceiver3 = ((Context) this.f30090b).registerReceiver(null, mo10756e());
                boolean z10 = true;
                if (intentRegisterReceiver3 != null && intentRegisterReceiver3.getAction() != null) {
                    String action = intentRegisterReceiver3.getAction();
                    if (action == null) {
                        z10 = false;
                    } else {
                        int iHashCode = action.hashCode();
                        if (iHashCode == -1181163412) {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        } else if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        }
                        z10 = false;
                    }
                }
                return Boolean.valueOf(z10);
        }
    }

    @Override // p613Z4.AbstractC10157d
    /* JADX INFO: renamed from: e */
    public final IntentFilter mo10756e() {
        switch (this.f30084g) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p613Z4.AbstractC10157d
    /* JADX INFO: renamed from: f */
    public final void mo10757f(Intent intent) {
        switch (this.f30084g) {
            case 0:
                AbstractC16544l.m18094g(intent, "intent");
                String action = intent.getAction();
                if (action != null) {
                    C7011q.m7408d().m7410a(AbstractC10155b.f30085a, "Received ".concat(action));
                    switch (action.hashCode()) {
                        case -1886648615:
                            if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                m10760b(Boolean.FALSE);
                                break;
                            }
                            break;
                        case -54942926:
                            if (action.equals("android.os.action.DISCHARGING")) {
                                m10760b(Boolean.FALSE);
                                break;
                            }
                            break;
                        case 948344062:
                            if (action.equals("android.os.action.CHARGING")) {
                                m10760b(Boolean.TRUE);
                                break;
                            }
                            break;
                        case 1019184907:
                            if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                m10760b(Boolean.TRUE);
                                break;
                            }
                            break;
                    }
                }
                break;
            case 1:
                AbstractC16544l.m18094g(intent, "intent");
                if (intent.getAction() != null) {
                    C7011q.m7408d().m7410a(AbstractC10156c.f30086a, "Received " + intent.getAction());
                    String action2 = intent.getAction();
                    if (action2 != null) {
                        int iHashCode = action2.hashCode();
                        if (iHashCode != -1980154005) {
                            if (iHashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                m10760b(Boolean.FALSE);
                            }
                            break;
                        } else if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                            m10760b(Boolean.TRUE);
                            break;
                        }
                    }
                }
                break;
            default:
                AbstractC16544l.m18094g(intent, "intent");
                if (intent.getAction() != null) {
                    C7011q.m7408d().m7410a(AbstractC10164k.f30099a, "Received " + intent.getAction());
                    String action3 = intent.getAction();
                    if (action3 != null) {
                        int iHashCode2 = action3.hashCode();
                        if (iHashCode2 != -1181163412) {
                            if (iHashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                m10760b(Boolean.TRUE);
                            }
                            break;
                        } else if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                            m10760b(Boolean.FALSE);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
