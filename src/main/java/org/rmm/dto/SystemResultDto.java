package org.rmm.dto;

import oshi.hardware.*;
import oshi.software.os.OSFileStore;

import java.util.List;

public class SystemResultDto {

   private CentralProcessor centralProcessorInfo;


   private GlobalMemory memoryInfo;


   private List<PowerSource> powerSourcesInfo;


   private List<OSFileStore> fileStoresInfo;


   private List<Display> displaysInfo;


   private Sensors sensorsInfo;

   public CentralProcessor getCentralProcessorInfo() {
      return centralProcessorInfo;
   }

   public void setCentralProcessorInfo(CentralProcessor centralProcessorInfo) {
      this.centralProcessorInfo = centralProcessorInfo;
   }

   public GlobalMemory getMemoryInfo() {
      return memoryInfo;
   }

   public void setMemoryInfo(GlobalMemory memoryInfo) {
      this.memoryInfo = memoryInfo;
   }

   public List<PowerSource> getPowerSourcesInfo() {
      return powerSourcesInfo;
   }

   public void setPowerSourcesInfo(List<PowerSource> powerSourcesInfo) {
      this.powerSourcesInfo = powerSourcesInfo;
   }

   public List<OSFileStore> getFileStoresInfo() {
      return fileStoresInfo;
   }

   public void setFileStoresInfo(List<OSFileStore> fileStoresInfo) {
      this.fileStoresInfo = fileStoresInfo;
   }

   public List<Display> getDisplaysInfo() {
      return displaysInfo;
   }

   public void setDisplaysInfo(List<Display> displaysInfo) {
      this.displaysInfo = displaysInfo;
   }

   public Sensors getSensorsInfo() {
      return sensorsInfo;
   }

   public void setSensorsInfo(Sensors sensorsInfo) {
      this.sensorsInfo = sensorsInfo;
   }


}
